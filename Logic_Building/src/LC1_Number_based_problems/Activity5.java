package LC1_Number_based_problems;
import java.util.Scanner;
public class Activity5 {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter 3 numbers:");
        for (int i = 1; i <= 3; i++){
            int num = sc.nextInt();
            sum += num;
        }
        System.out.println("Sum is "+sum);
        sc.close();
    }  
}
