package Arrays;

public class HandsOnAssignment3 {
	public static void main(String[] args) {
        int[] a = {1,4,34,56,7};
        int s = 56;
        int index = -1;
        for (int i = 0; i < a.length; i++){
            if (a[i] == s){
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
