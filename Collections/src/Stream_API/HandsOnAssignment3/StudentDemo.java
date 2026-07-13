package Stream_API.HandsOnAssignment3;
import java.util.ArrayList;
public class StudentDemo {
	public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student(101, "Rahul", 38));
        studentList.add(new Student(102, "Sneha", 75));
        studentList.add(new Student(103, "Arjun", 60));
        studentList.add(new Student(104, "sita", 50));
        studentList.add(new Student(105, "Ram", 98));
        long count = studentList.stream()
                .filter(s -> s.mark >= 50)
                .count();
        System.out.println("Number of Students Passed = " + count);
    }
}
