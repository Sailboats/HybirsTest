import org.junit.Test;

import com.noodle.hybris.dao.OrderServiceImp;

public class TestCase3 {

	/**
	 * 下单商品B 4个，根据地理位置拆单策略
	 */
	@Test
	public void test3() {
		System.out.println("下单商品B 4个，根据地理位置拆单策略");
		new OrderServiceImp().getGoodsByLocation(2, 4);
		System.out.println("\n\n");
	}

}
