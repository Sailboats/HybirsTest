package com.noodle.hybris.dao;

public interface OrderService {

	/**
	 * ���ݲֿ����λ�þ�����������
	 * 
	 * @param type
	 *            ��Ʒ����,a=1,b=2,c=3
	 * @param count
	 *            ��������
	 */
	void getGoodsByLocation(int type, int count);

	/**
	 * ���ݲֿ����ȼ�������������
	 * 
	 * @param type
	 *            ��Ʒ����,a=1,b=2,c=3
	 * @param count
	 *            ��������
	 */
	void getGoodsByPriority(int type, int count);
}
