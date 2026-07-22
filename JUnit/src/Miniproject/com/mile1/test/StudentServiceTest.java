package Miniproject.com.mile1.test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import Miniproject.com.mile1.bean.Student;
import Miniproject.com.mile1.service.StudentService;
public class StudentServiceTest {
    StudentService service = new StudentService();
    Student[] data = {
        new Student("Sekar", new int[] {85,75,96}),
        new Student(null, new int[] {11,22,33}),
        new Student("Manoj", null),
        null
    };
    @Test
    public void testFindNumberOfNullNames() {
        assertEquals(1, service.findNumberOfNullNames(data));
    }
    @Test
    public void testFindNumberOfNullObjects() {
        assertEquals(1, service.findNumberOfNullObjects(data));
    }
    @Test
    public void testFindNumberOfNullMarksArray() {
        assertEquals(1, service.findNumberOfNullMarksArray(data));
    }
}
