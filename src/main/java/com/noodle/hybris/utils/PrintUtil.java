/**
 * 
 */
package com.noodle.hybris.utils;

/**
 * ��ӡ������
 * 
 * @author Noodle
 * 
 */
public class PrintUtil {

	private static int num = 1;

	public static void resetNum() {
		num = 1;
	}

	public static void PrintRow(int type, int count, String w) {

		System.out.println(num++ + "							"
				+ (type == 1 ? "a" : (type == 2 ? "b" : "c")) + "							"
				+ count + "							" + w);

	}

	public static void PrintHead() {

		System.out.println("��������	��Ʒ����	����		�����ֿ�");
	}
}
