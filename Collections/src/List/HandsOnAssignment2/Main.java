package List.HandsOnAssignment2;

public class Main {
	public static void main(String[] args) {
        EmployeeDB db = new EmployeeDB();
        Employee e1 = new Employee(101, "Harshitha", "harshitha@gmail.com", "Female", 50000);
        Employee e2 = new Employee(102, "Rahul", "rahul@gmail.com", "Male", 45000);
        db.addEmployee(e1);
        db.addEmployee(e2);
        System.out.println("Employee Details");
        db.displayEmployees();
        System.out.println(db.showPaySlip(101));
        System.out.println("Delete Employee 102");
        db.deleteEmployee(102);
        System.out.println("After Deletion");
        db.displayEmployees();
    }
}
