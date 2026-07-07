package Inheritance.HandsOnAssignment2;

public class TestEmployee {
	public static void main(String[] args){
        Employee emp = new Employee(
                "Harshitha",
                600000.0,
                2026,
                "NI123456");
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Annual Salary: " + emp.getAnnualSalary());
        System.out.println("Year Started: " + emp.getYearStarted());
        System.out.println("National Insurance Number: " + emp.getNationalInsuranceNumber());
    }
}
