package com.noodle.hybris.test;

import org.junit.Test;

import com.noodle.hybris.dao.OrderServiceImp;
import com.noodle.hybris.entity.Order;
import com.noodle.hybris.utils.PrintUtil;

public class TestCase2 {

	/**
	 * 下单商品B 2个
	 */
	@Test
	public void test2() {

		System.out.println("下单 B 商品 4 件");
		PrintUtil.PrintHead();
		new OrderServiceImp().getGoods(new Order(2, 4));
		System.out.println("\n\n");
	}

}
