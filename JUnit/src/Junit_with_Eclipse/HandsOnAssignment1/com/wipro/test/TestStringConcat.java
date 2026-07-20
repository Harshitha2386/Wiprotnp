package Junit_with_Eclipse.HandsOnAssignment1.com.wipro.test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import Junit_with_Eclipse.HandsOnAssignment1.com.wipro.task.DailyTasks;
public class TestStringConcat {
    @Test
    public void testDoStringConcat() {
        DailyTasks o = new DailyTasks();
        String actual = o.doStringConcat("Cyber", "Security");
        String expected = "Cyber Security";
        assertEquals(expected, actual);
    }
}
