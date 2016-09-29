import org.junit.Test;

import com.noodle.hybris.dao.OrderServiceImp;

public class TestCase2 {

	/**
	 * 下单商品A 2个，根据仓库优先级拆单策略
	 */
	@Test
	public void test2() {
		System.out.println("下单商品A 2个，根据仓库优先级拆单策略");
		new OrderServiceImp().getGoodsByPriority(1, 2);
		System.out.println("\n\n");
	}

}
