package com.noodle.hybris.test;

import org.junit.Test;

import com.noodle.hybris.dao.OrderServiceImp;
import com.noodle.hybris.entity.Order;
import com.noodle.hybris.utils.PrintUtil;

public class TestCase1 {

	/**
	 * �µ���ƷA 2��
	 */
	@Test
	public void test1() {

		System.out.println("�µ� A ��Ʒ 2 ��");
		PrintUtil.PrintHead();
		new OrderServiceImp().getGoods(new Order(1, 2));
		System.out.println("\n\n");
	}

}
