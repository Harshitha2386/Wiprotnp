package Assert_Methods_and_Annotations.HandsOnAssignment1.com.wipro.test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import Assert_Methods_and_Annotations.HandsOnAssignment1.com.wipro.task.SortValues;
public class TestSort {
	 @Test
	    public void testSortValues() {
	        SortValues obj = new SortValues();
	        int[] actual = obj.sortValues(new int[] {35,50,40,55,45});
	        int[] expected = {35,40,45,50,55};
	        assertArrayEquals(expected, actual);
	    }
}
