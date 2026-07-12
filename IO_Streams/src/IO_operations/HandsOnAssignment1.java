package IO_operations;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class HandsOnAssignment1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name");
        String fileName = sc.nextLine();
        System.out.println("Enter the character to be counted");
        char ch = Character.toLowerCase(sc.next().charAt(0));
        int count = 0;
        try {
            FileReader fr = new FileReader(fileName);
            int data;
            while ((data = fr.read()) != -1){
                char c = Character.toLowerCase((char) data);
                if (c == ch){
                    count++;
                }
            }
            fr.close();
            System.out.println("File '" + fileName + "' has " + count + " instances of letter '" + ch + "'.");
        } catch (IOException e) {
            System.out.println("File not found");
        }
        sc.close();
    }
}
