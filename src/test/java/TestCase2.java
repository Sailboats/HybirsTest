import org.junit.Test;

import com.noodle.hybris.dao.OrderServiceImp;

public class TestCase2 {

	/**
	 * �µ���ƷA 2�������ݲֿ����ȼ��𵥲���
	 */
	@Test
	public void test2() {
		System.out.println("�µ���ƷA 2�������ݲֿ����ȼ��𵥲���");
		new OrderServiceImp().getGoodsByPriority(1, 2);
		System.out.println("\n\n");
	}

}
