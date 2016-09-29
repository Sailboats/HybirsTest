import org.junit.Test;

import com.noodle.hybris.dao.OrderServiceImp;

public class TestCase4 {

	/**
	 * 下单商品B 4个，根据仓库优先级拆单策略
	 */
	@Test
	public void test4() {
		System.out.println("下单商品B 4个，根据仓库优先级拆单策略");
		new OrderServiceImp().getGoodsByPriority(2, 4);
	}

}
