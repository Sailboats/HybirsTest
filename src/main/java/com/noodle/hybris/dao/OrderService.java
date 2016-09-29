package com.noodle.hybris.dao;

public interface OrderService {

	/**
	 * 根据仓库地理位置决定出货策略
	 * 
	 * @param type
	 *            商品类型,a=1,b=2,c=3
	 * @param count
	 *            出货数量
	 */
	void getGoodsByLocation(int type, int count);

	/**
	 * 根据仓库优先级决定出货策略
	 * 
	 * @param type
	 *            商品类型,a=1,b=2,c=3
	 * @param count
	 *            出货数量
	 */
	void getGoodsByPriority(int type, int count);
}
