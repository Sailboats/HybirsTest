import org.junit.Test;

import com.noodle.hybris.dao.OrderServiceImp;

public class TestCase3 {

	/**
	 * �µ���ƷB 4�������ݵ���λ�ò𵥲���
	 */
	@Test
	public void test3() {
		System.out.println("�µ���ƷB 4�������ݵ���λ�ò𵥲���");
		new OrderServiceImp().getGoodsByLocation(2, 4);
		System.out.println("\n\n");
	}

}
