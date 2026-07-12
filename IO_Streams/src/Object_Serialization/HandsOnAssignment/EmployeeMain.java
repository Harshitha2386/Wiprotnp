package Object_Serialization.HandsOnAssignment;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp = new Employee(
                "Harshitha",
                new Date(),
                "IT",
                "Software Engineer",
                50000.0);

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data"));
            oos.writeObject(emp);
            oos.close();
            System.out.println("Object Serialized Successfully");
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data"));
            Employee e = (Employee) ois.readObject();
            ois.close();
            System.out.println("\nEmployee Details");
            System.out.println("Name : " + e.getName());
            System.out.println("Date of Birth : " + e.getDateOfBirth());
            System.out.println("Department : " + e.getDepartment());
            System.out.println("Designation : " + e.getDesignation());
            System.out.println("Salary : " + e.getSalary());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
