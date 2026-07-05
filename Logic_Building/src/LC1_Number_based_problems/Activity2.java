package LC1_Number_based_problems;
import java.util.Scanner;
public class Activity2 {
	 public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        int count = 0;
	        System.out.print("Enter marks of Student 1: ");
	        int m1 = sc.nextInt();
	        System.out.print("Enter marks of Student 2: ");
	        int m2 = sc.nextInt();
	        System.out.print("Enter marks of Student 3: ");
	        int m3 = sc.nextInt();
	        if (m1 >= 35){
	            count++;
	        }
	        if (m2 >= 35){
	            count++;
	        }
	        if (m3 >= 35){
	            count++;
	        }
	        System.out.println("Number of students passed: "+count);
	        sc.close();
	    }
}
