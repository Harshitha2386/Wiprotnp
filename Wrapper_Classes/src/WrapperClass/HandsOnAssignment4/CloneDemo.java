package WrapperClass.HandsOnAssignment4;

public class CloneDemo {
	    public static void main(String[] args) throws CloneNotSupportedException {
	        Employee emp1 = new Employee(101, "Harshitha", 50000);
	        Employee emp2 = (Employee) emp1.clone();
	        emp1.id = 102;
	        emp1.name = "Sai";
	        emp1.salary = 60000;
	        System.out.println("Original Employee");
	        emp1.display();
	        System.out.println();
	        System.out.println("Cloned Employee");
	        emp2.display();
	    }
}
