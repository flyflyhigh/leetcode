import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class TwoSumDesignTest {
    TwoSumDesign tsd;
    public TwoSumDesignTest(){
        tsd = new TwoSumDesign();
        tsd.add(1);
        tsd.add(3);
        tsd.add(3);
        tsd.add(8);
    }
    @Test
    public void testFound() {
        assertTrue(tsd.find(4));
        assertTrue(tsd.find(6));
    }

    @Test
    public void testNotFound() {
        assertFalse(tsd.find(7));
    }
}
