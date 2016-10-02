import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoSumTest {

	@Test
	public void testFound() {
		TwoSum ts = new TwoSum();
		int[] result = ts.twoSum(new int[]{2, 7, 11, 15}, 9);
		assertEquals(result[0], 0);
		assertEquals(result[1], 1);
	}
	
	@Test
	public void testNotFound() {
		TwoSum ts = new TwoSum();
		int[] result = ts.twoSum(new int[]{2, 7, 11, 15}, 8);
		assertEquals(result[0], -1);
		assertEquals(result[1], -1);
	}
}
