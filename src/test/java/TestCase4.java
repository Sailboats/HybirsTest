import org.junit.Test;

import com.noodle.hybris.dao.OrderServiceImp;

public class TestCase4 {

	/**
	 * �µ���ƷB 4�������ݲֿ����ȼ��𵥲���
	 */
	@Test
	public void test4() {
		System.out.println("�µ���ƷB 4�������ݲֿ����ȼ��𵥲���");
		new OrderServiceImp().getGoodsByPriority(2, 4);
	}

}
