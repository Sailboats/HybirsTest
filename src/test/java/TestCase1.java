import org.junit.Test;

import com.noodle.hybris.dao.OrderServiceImp;

public class TestCase1 {

	/**
	 * 下单商品A 2个，根据地理位置拆单策略
	 */
	@Test
	public void test1() {
		System.out.println("下单商品A 2个，根据地理位置拆单策略");
		new OrderServiceImp().getGoodsByLocation(1, 2);
		System.out.println("\n\n");
	}

}
