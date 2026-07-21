package Assert_Methods_and_Annotations.HandsOnAssignment2.com.wipro.test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import Assert_Methods_and_Annotations.HandsOnAssignment2.com.wipro.task.SortValues;
public class TestCheckPresence {
	@Test
    public void testSortValues() {
        SortValues obj = new SortValues();
        int[] result = obj.sortValues(new int[] {35,50,40,55,45});
        assertTrue(result[0] == 35);
        assertTrue(result[1] == 40);
        assertFalse(result[0] == 45);
    }
}
