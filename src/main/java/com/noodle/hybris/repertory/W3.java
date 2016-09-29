/**
 * 
 */
package com.noodle.hybris.repertory;

import com.noodle.hybris.utils.PrintUtil;

/**
 * ²Ö¿â3
 * @author Noodle
 * 
 */
public class W3 {

	private static int a = 1;
	private static int b = 3;
	private static int c = 1;

	private W3() {
	}

	public static boolean getGoods(int type) {
		switch (type) {
		case 1:
			return getA();
		case 2:
			return getB();
		case 3:
			return getC();
		default:
			return false;
		}
	}

	public static boolean getA() {

		if (a > 0) {
			a--;
			PrintUtil.PrintRow(1, 1, "W3");
			return true;
		}

		return false;
	}

	public static boolean getB() {

		if (b > 0) {
			b--;
			PrintUtil.PrintRow(2, 1, "W3");
			return true;
		}

		return false;
	}

	public static boolean getC() {

		if (c > 0) {
			c--;
			PrintUtil.PrintRow(3, 1, "W3");
			return true;
		}

		return false;
	}
}
