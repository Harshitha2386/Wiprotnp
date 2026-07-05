package LC1_Number_based_problems;
import java.util.Scanner;
public class Activity1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter value of a: ");
	        int a = sc.nextInt();
	        System.out.print("Enter value of b: ");
	        int b = sc.nextInt();
	        System.out.print("Enter value of c: ");
	        int c = sc.nextInt();
	        int temp = c;   
	        c = b;          
	        b = a;          
	        a = temp;       
	        System.out.println("After Change:");
	        System.out.println("a = "+a);
	        System.out.println("b = "+b);
	        System.out.println("c = "+c);
	        sc.close();
	}
}
