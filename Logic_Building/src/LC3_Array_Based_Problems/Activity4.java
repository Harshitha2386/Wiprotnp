package LC3_Array_Based_Problems;
import java.util.Scanner; 
public class Activity4 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the array size: ");
	        int n = sc.nextInt();             
	        int[] marks = new int[n];
	        int[] count = new int[101]; 
	        System.out.println("Enter marks of "+n+" students:");
	        for (int i = 0; i < n; i++) {
	            marks[i] = sc.nextInt();
	            if (marks[i] >= 0 && marks[i] <= 100) {
	                count[marks[i]]++;
	            } else {
	                System.out.println("Invalid mark! Enter marks between 0 and 100.");
	                i--; 
	            }
	        }

	        System.out.println("\nCount of students for each mark:");
	        for (int i = 0; i <= 100; i++) {
	            if (count[i] > 0) {
	                System.out.println("Mark " + i + " = " + count[i] + " student(s)");
	            }
	        }

	        sc.close();
	    }
}
