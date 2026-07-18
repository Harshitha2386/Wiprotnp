package LC3_Array_Based_Problems;
import java.util.Scanner;
public class Activity2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array 20 elements: ");
		int[] array = new int[20];
		for(int i = 0; i < 20; i++) {
			array[i]=sc.nextInt();
		}
		int min1=Integer.MAX_VALUE, min2=Integer.MAX_VALUE, min3=Integer.MAX_VALUE;
		int max1=Integer.MIN_VALUE, max2=Integer.MIN_VALUE, max3=Integer.MIN_VALUE;
		for(int i=0;i<20;i++) {
			if(array[i]<min1) {
				min3=min2;
				min2=min1;
				min1=array[i];
			}else if(array[i]<min2) {
				min3=min2;
				min2=array[i];
			}else if(array[i]<min3){
				min3=array[i];
			}
			if(array[i]>max1) {
				max3=max2;
				max2=max1;
				max1=array[i];
			}else if(array[i]>max2) {
				max3=max2;
				max2=array[i];
			}else if(array[i]>max3){
				max3=array[i];
			}
		}
		System.out.println("max1: "+max1+" max2: "+max2+" max3: "+max3);
		System.out.println("min1: "+min1+" min2: "+min2+" min3: "+min3);
		sc.close();
	}
}
