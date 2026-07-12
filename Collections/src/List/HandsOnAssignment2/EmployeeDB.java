package List.HandsOnAssignment2;
import java.util.ArrayList;
import java.util.Iterator;
public class EmployeeDB {
    ArrayList<Employee> list = new ArrayList<>();
    public boolean addEmployee(Employee e){
        list.add(e);
        return true;
    }
    public boolean deleteEmployee(int empId){
        Iterator<Employee> itr = list.iterator();
        while (itr.hasNext()){
            Employee e = itr.next();
            if (e.empId == empId){
                itr.remove();
                return true;
            }
        }
        return false;
    }
    public String showPaySlip(int empId) {
        for (Employee e : list) {
            if (e.empId == empId) {
                return "Pay Slip\nEmployee ID : " + e.empId +
                        "\nEmployee Name : " + e.empName +
                        "\nSalary : " + e.salary;
            }
        }
        return "Employee Not Found";
    }
    public void displayEmployees() {
        for (Employee e : list) {
            e.GetEmployeeDetails();
            System.out.println("-----------------------");
        }
    }
}
