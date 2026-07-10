package Day3;
import java.util.Scanner;
public class Q5 {
	 public static int addLastDigits(int input1, int input2) {
	        return Math.abs(input1 % 10) + Math.abs(input2 % 10);
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int input1 = sc.nextInt();
	        int input2 = sc.nextInt();
	        System.out.println(addLastDigits(input1, input2));
	        sc.close();
	    }
}
