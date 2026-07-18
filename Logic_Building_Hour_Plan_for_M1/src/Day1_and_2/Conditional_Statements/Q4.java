package Day1_and_2.Conditional_Statements;
import java.util.Scanner;
public class Q4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        if (sum % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
        sc.close();
    }
}
