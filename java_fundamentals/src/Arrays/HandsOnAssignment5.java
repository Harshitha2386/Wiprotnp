package Arrays;

public class HandsOnAssignment5 {
	 public static void main(String[] args){
	        int[] a = {54, 76, 87, 5, 2, 64, 13};
	        for (int i = 0; i < a.length - 1; i++){
	            for (int j = i + 1; j < a.length; j++){
	                if (a[i] > a[j]) {
	                    int temp = a[i];
	                    a[i] = a[j];
	                    a[j] = temp;
	                }
	            }
	        }
	        System.out.println("Smallest two Numbers: "+a[0]+" "+a[1]);
	        System.out.println("Largest two Numbers: "+a[a.length - 2]+" "+a[a.length - 1]);
	 }
}
