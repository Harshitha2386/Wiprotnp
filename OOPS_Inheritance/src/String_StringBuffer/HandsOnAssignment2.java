package String_StringBuffer;
import java.util.Scanner;
public class HandsOnAssignment2 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter first string: ");
	        String s1 = sc.nextLine();
	        System.out.print("Enter second string: ");
	        String s2 = sc.nextLine();
	        if (Character.toLowerCase(s1.charAt(s1.length() - 1)) == Character.toLowerCase(s2.charAt(0))) {
	            s2 = s2.substring(1);
	        }
	        String result = (s1 + s2).toLowerCase();
	        System.out.println(result);
	        sc.close();
	    }
}
