package LC3_Array_Based_Problems;
import java.util.Scanner;
public class Activity3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array 10 elements: ");
		int[] array = new int[10];
		for(int i = 0; i < 10; i++) {
			array[i]=sc.nextInt();
		}
		for(int i=9;i>=0;i--) {
			System.out.print(array[i]+" ");
		}
		sc.close();
	}

}
