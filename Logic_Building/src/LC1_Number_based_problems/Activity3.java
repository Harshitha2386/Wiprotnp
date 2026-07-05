package LC1_Number_based_problems;
import java.util.Scanner;
public class Activity3 {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        System.out.println("Enter 5 numbers:");
        for (int i = 1; i <= 5; i++){
            int num = sc.nextInt();
            if (num >= 0) {
                positive++;
            } else {
                negative++;
            }
        }
        System.out.println("Positive: "+positive);
        System.out.println("Negative: "+negative);
        sc.close();
    }  
}
