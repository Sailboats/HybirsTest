package com.noodle.hybris.test;

import org.junit.Test;

import com.noodle.hybris.dao.OrderServiceImp;
import com.noodle.hybris.entity.Order;
import com.noodle.hybris.utils.PrintUtil;

public class TestCase1 {

	/**
	 * 下单商品A 2个
	 */
	@Test
	public void test1() {

		System.out.println("下单 A 商品 2 件");
		PrintUtil.PrintHead();
		new OrderServiceImp().getGoods(new Order(1, 2));
		System.out.println("\n\n");
	}

}
