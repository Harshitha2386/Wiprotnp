package List.HandsOnAssignment7;
import java.util.Vector;
import java.util.Iterator;
import java.util.Enumeration;

public class Main {
	 public static void main(String[] args) {
	        Vector<Employee> v = new Vector<Employee>();
	        v.add(new Employee(101, "Harshitha", 50000));
	        v.add(new Employee(102, "Ram", 45000));
	        v.add(new Employee(103, "sita", 55000));
	        System.out.println("Using Iterator");
	        Iterator<Employee> itr = v.iterator();
	        while (itr.hasNext()) {
	            Employee e = itr.next();
	            e.display();
	            System.out.println("----------------");
	        }
	        System.out.println("Using Enumeration");
	        Enumeration<Employee> en = v.elements();
	        while (en.hasMoreElements()) {
	            Employee e = en.nextElement();
	            e.display();
	            System.out.println("----------------");
	        }
	    }
}
