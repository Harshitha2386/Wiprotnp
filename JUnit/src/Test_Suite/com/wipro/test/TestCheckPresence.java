package Test_Suite.com.wipro.test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import Test_Suite.com.wipro.task.SortValues;
public class TestCheckPresence {
	@Test
    public void testSortValues() {
        SortValues obj = new SortValues();
        int[] result = obj.sortValues(new int[] {35,40,45,25,30});
        assertTrue(result[0] == 25);
        assertTrue(result[1] == 30);
        assertFalse(result[0] == 45);
    }
}
