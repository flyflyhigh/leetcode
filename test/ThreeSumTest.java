import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ThreeSumTest {
    @Test
    public void testFound(){
        ThreeSum ts = new ThreeSum();
        List<List<Integer>> result = ts.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1));
        assertEquals(result, expected);
    }
}
