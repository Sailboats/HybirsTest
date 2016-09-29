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
	 * ���ݲֿ����λ�ò�
	 */
	public void getGoodsByLocation(int type, int count) {

		PrintUtil.resetNum();
		PrintUtil.PrintHead();

		// ���վ�������˳��Ϊ w3=w2>w1 �Ĳ���������

		for (int i = 0; i < count; i++) {
			if (W1.getGoods(type)) {

			} else if (W2.getGoods(type)) {

			} else
				W3.getGoods(type);

		}

	}

	/*
	 * ���ݲֿ����ȼ���
	 */
	public void getGoodsByPriority(int type, int count) {
		PrintUtil.resetNum();
		PrintUtil.PrintHead();

		// ���ղֿ����ȼ������� w1<w2<w3 ��˳��������
		for (int i = 0; i < count; i++) {
			if (W3.getGoods(type)) {

			} else if (W2.getGoods(type)) {

			} else {
				W1.getGoods(type);
			}
		}
	}

}
