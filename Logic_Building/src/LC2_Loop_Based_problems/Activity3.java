package LC2_Loop_Based_problems;

import java.util.Scanner;

public class Activity3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter decimal number: ");
		int n = sc.nextInt();
		if(n == 0) {
			System.out.println("Binary: 0 ");
		}
		String binary ="";
		while(n>0) {
			binary = (n%2)+binary;
			n = n/2;
		}
		System.out.print("Binary: "+binary);
		sc.close();
	}
}
