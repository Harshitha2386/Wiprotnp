package Miniproject.com.mile1.test;
import org.junit.Test;
import Miniproject.com.mile1.bean.Student;
import Miniproject.com.mile1.exception.NullMarksArrayException;
import Miniproject.com.mile1.exception.NullNameException;
import Miniproject.com.mile1.exception.NullStudentObjectException;
import Miniproject.com.mile1.service.StudentReport;
public class ValidateTest {
	  StudentReport report = new StudentReport();
	    @Test(expected = NullStudentObjectException.class)
	    public void testNullStudentObject() throws Exception {
	        report.validate(null);
	    }
	    @Test(expected = NullNameException.class)
	    public void testNullName() throws Exception {
	        Student s = new Student(null, new int[] {80,90,95});
	        report.validate(s);
	    }
	    @Test(expected = NullMarksArrayException.class)
	    public void testNullMarksArray() throws Exception {
	        Student s = new Student("Ram", null);
	        report.validate(s);
	    }
}
