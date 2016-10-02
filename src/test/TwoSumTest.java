package test;

import static org.junit.Assert.*;

import org.junit.Test;

import leetcode.TwoSum;

public class TwoSumTest {

	@Test
	public void testFound() {
		TwoSum ts = new TwoSum();
		int[] result = ts.twoSum(new int[]{2, 7, 11, 15}, 9);
		assertEquals("find tow sum", result[0], 0);
		assertEquals("find tow sum", result[1], 1);
	}
	
	@Test
	public void testNotFound() {
		TwoSum ts = new TwoSum();
		int[] result = ts.twoSum(new int[]{2, 7, 11, 15}, 8);
		assertEquals("find tow sum", result[0], -1);
		assertEquals("find tow sum", result[1], -1);
	}
}
