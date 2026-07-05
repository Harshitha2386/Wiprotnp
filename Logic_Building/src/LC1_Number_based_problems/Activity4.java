package LC1_Number_based_problems;
import java.util.Scanner;
public class Activity4 {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n % 2 == 0) {
        	System.out.println(n + " is Even");
        }
        else if(n % 2 != 0) {
        	System.out.println(n + " is Odd");
        }else {
        	System.out.println(n + " is Zero");
        }
        sc.close();
        
    }  
}
