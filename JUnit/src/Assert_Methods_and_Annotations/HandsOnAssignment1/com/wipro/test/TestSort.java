package Assert_Methods_and_Annotations.HandsOnAssignment1.com.wipro.test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import Assert_Methods_and_Annotations.HandsOnAssignment1.com.wipro.task.SortValues;
public class TestSort {
	 @Test
	    public void testSortValues() {
	        SortValues obj = new SortValues();
	        int[] actual = obj.sortValues(new int[] {35,40,70,25,65});
	        int[] expected = {25,35,40,65,70};
	        assertArrayEquals(expected, actual);
	    }
}
