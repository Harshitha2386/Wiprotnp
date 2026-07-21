package Test_Suite.com.wipro.test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import Test_Suite.com.wipro.task.DailyTasks;
public class TestStringConcat {
	 @Test
	    public void testDoStringConcat() {
	        DailyTasks obj = new DailyTasks();
	        String actual = obj.doStringConcat("Happy", "Programming");
	        String expected = "Happy Programming";
	        assertEquals(expected, actual);
	    }
}
