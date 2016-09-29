/**
 * 
 */
package com.noodle.hybris.utils;

import java.util.Comparator;

import com.noodle.hybris.repertory.BaseW;

/**
 * �ֿ����������ȼ��Ƚ�������������Ʒ����������£�����ɸѡ������Ĳֿ⣬�ٵ����ȼ��ߵĲֿ�
 * 
 * @author Noodle
 * 
 */
public class OrderDistanceOrPriorityComparator implements Comparator<BaseW> {

	public int compare(BaseW o1, BaseW o2) {
		return o1.getDistance() - o2.getDistance() == 0 ? o2.getPriority()
				- o1.getPriority() : o1.getDistance() - o2.getDistance();
	}

}
