package String_StringBuffer;
import java.util.Scanner;
public class HandsOnAssignment9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        String result = "";
        int min = Math.min(s1.length(), s2.length());
        for (int i = 0; i < min; i++){
            result = result + s1.charAt(i) + s2.charAt(i);
        }
        if (s1.length() > s2.length()){
            result = result + s1.substring(min);
        } else if (s2.length() > s1.length()) {
            result = result + s2.substring(min);
        }
        System.out.println(result);
        sc.close();
    }
}
