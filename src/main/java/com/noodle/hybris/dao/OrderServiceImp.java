/**
 * 
 */
package com.noodle.hybris.dao;

import com.noodle.hybris.repertory.W1;
import com.noodle.hybris.repertory.W2;
import com.noodle.hybris.repertory.W3;
import com.noodle.hybris.utils.PrintUtil;

/**
 * @author Noodle
 * 
 */
public class OrderServiceImp implements OrderService {

	/*
	 * 根据仓库地理位置拆单
	 */
	public void getGoodsByLocation(int type, int count) {

		PrintUtil.resetNum();
		PrintUtil.PrintHead();

		// 按照距离依次顺序为 w3=w2>w1 的策略来出货

		for (int i = 0; i < count; i++) {
			if (W1.getGoods(type)) {

			} else if (W2.getGoods(type)) {

			} else
				W3.getGoods(type);

		}

	}

	/*
	 * 根据仓库优先级拆单
	 */
	public void getGoodsByPriority(int type, int count) {
		PrintUtil.resetNum();
		PrintUtil.PrintHead();

		// 按照仓库优先级排序是 w1<w2<w3 的顺序来出货
		for (int i = 0; i < count; i++) {
			if (W3.getGoods(type)) {

			} else if (W2.getGoods(type)) {

			} else {
				W1.getGoods(type);
			}
		}
	}

}
