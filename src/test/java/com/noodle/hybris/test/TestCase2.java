package com.noodle.hybris.test;

import org.junit.Test;

import com.noodle.hybris.dao.OrderServiceImp;
import com.noodle.hybris.entity.Order;
import com.noodle.hybris.utils.PrintUtil;

public class TestCase2 {

	/**
	 * �µ���ƷB 2��
	 */
	@Test
	public void test2() {

		System.out.println("�µ� B ��Ʒ 4 ��");
		PrintUtil.PrintHead();
		new OrderServiceImp().getGoods(new Order(2, 4));
		System.out.println("\n\n");
	}

}
