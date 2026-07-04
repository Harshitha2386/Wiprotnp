package FlowControl_Statements;

public class HandsOnAssignment1b {
	public static void main(String[] args) {
	        int n1 = Integer.parseInt(args[0]);
	        int n2 = Integer.parseInt(args[1]);
	        if ((n1 % 10) == (n2 % 10)) {
	            System.out.println(true);
	        } else {
	            System.out.println(false);
	        }
	    }
}
