import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThreeSumSmallerTest {
    @Test
    public void test(){
        ThreeSumSmaller tss = new ThreeSumSmaller();
        int result = tss.threeSumSmaller(new int[]{-2, 0, 1, 3}, 2);
        assertEquals(result, 2);
    }
}
