package LC3_Array_Based_Problems;
import java.util.Scanner;
public class Activity1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array 10 elements: ");
		int[] array = new int[10];
		int sum=0;
		for(int i = 0; i < 10; i++) {
			array[i]=sc.nextInt();
			sum += array[i];
		}
		System.out.println("The sum of the array is "+sum);
		sc.close();
	}

}
