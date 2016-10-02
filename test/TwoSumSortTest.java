import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoSumSortTest {
    @Test
    public void testFound() {
        TwoSumSort tss = new TwoSumSort();
        int[] result = tss.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertEquals(result[0], 0);
        assertEquals(result[1], 1);
    }
}

