import org.junit.Test;

import com.noodle.hybris.dao.OrderServiceImp;

public class TestCase1 {

	/**
	 * �µ���ƷA 2�������ݵ���λ�ò𵥲���
	 */
	@Test
	public void test1() {
		System.out.println("�µ���ƷA 2�������ݵ���λ�ò𵥲���");
		new OrderServiceImp().getGoodsByLocation(1, 2);
		System.out.println("\n\n");
	}

}
