/**
 * 
 */
package com.noodle.hybris.dao;

import java.util.ArrayList;
import java.util.List;

import com.noodle.hybris.entity.Order;
import com.noodle.hybris.repertory.BaseW;
import com.noodle.hybris.utils.OrderComparator;
import com.noodle.hybris.utils.OrderDistanceOrPriorityComparator;

/**
 * @author Noodle
 * 
 */
public class OrderServiceImp implements OrderService {

	/*
	 * 寻源方法
	 */
	public void getGoods(Order order) {

		if (findSourceByOneW(order)) {
			// 单独一个仓库就可以满足出货要求
		} else {
			// 需要多个仓库才能满足出货要求
			findSourceByManyW(order);
		}

	}

	/**
	 * 在多个仓库中寻源
	 * 
	 * @param order
	 */
	private void findSourceByManyW(Order order) {
		// 2.其次判断单个仓库不能独自满足出货要求的情况
		List<BaseW> ws = initW();

		ws.sort(new OrderComparator(order));

		int total_count = 0;
		int size1 = ws.size();
		// 2.1筛选仓库集合中可以满足出货要求的最小子集
		for (int i = 0, true_index = 0; i < size1; i++, true_index++) {

			if (total_count >= order.getCount()) {
				ws.remove(true_index);
			} else {
				total_count += ws.get(true_index).getCountByType(
						order.getType());
			}
		}
		// 2.2遍历集合，开始出货
		for (BaseW baseW : ws) {
			baseW.beginDeliver(order);
		}
	}

	/**
	 * 在单个仓库中寻源
	 * 
	 * @param order
	 */
	private boolean findSourceByOneW(Order order) {
		List<BaseW> ws = initW();

		// 1.首先判断单个仓库是否能独自满足出货需求，筛选仓库列表里面是否存在单个仓库可以满足出货需求
		int size = ws.size();
		for (int i = 0, true_index = 0; i < size; i++, true_index++) {
			if (!ws.get(true_index).canSatisfy(order)) {
				ws.remove(true_index);
				true_index--;
			}
		}

		if (!ws.isEmpty()) {
			if (ws.size() >= 2) {
				ws.sort(new OrderDistanceOrPriorityComparator());
			}
			// 1.1选定该仓库，开始出货
			BaseW target = ws.get(0);
			target.beginDeliver(order);
			return true;
		}
		return false;
	}

	/**
	 * 初始化仓库，按照题目要求建立测试数据
	 * 
	 * @return
	 */
	private List<BaseW> initW() {
		List<BaseW> ws = new ArrayList<BaseW>();

		ws.add(new BaseW(1, 2, 2, 1, 1, "W1"));
		ws.add(new BaseW(2, 1, 2, 2, 2, "W2"));
		ws.add(new BaseW(1, 3, 1, 2, 3, "W3"));
		return ws;
	}

}
