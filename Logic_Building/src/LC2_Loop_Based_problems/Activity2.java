package LC2_Loop_Based_problems;
import java.util.Scanner;
public class Activity2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		while(n>0) {
			int digit = n%10;
			total += digit;
			n = n/10;
		}
		System.out.print(total);
		sc.close();
	}
}
