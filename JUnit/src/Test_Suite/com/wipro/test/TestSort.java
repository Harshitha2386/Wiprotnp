package Test_Suite.com.wipro.test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import Test_Suite.com.wipro.task.SortValues;
public class TestSort {
	@Test
    public void testSortValues() {
        SortValues obj = new SortValues();
        int[] actual = obj.sortValues(new int[] {35,40,45,25,30});
        int[] expected = {25,30,35,40,45};
        assertArrayEquals(expected, actual);
    }
}
