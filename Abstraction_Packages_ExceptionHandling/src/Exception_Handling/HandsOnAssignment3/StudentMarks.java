package Exception_Handling.HandsOnAssignment3;
import java.util.Scanner;
public class StudentMarks {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        try {

	            for(int i=1;i<=2;i++) {

	                System.out.println("Enter Student Name:");
	                String name = sc.nextLine();

	                int sum = 0;

	                System.out.println("Enter marks in 3 subjects:");

	                for(int j=1;j<=3;j++) {

	                    int mark = Integer.parseInt(sc.nextLine());

	                    if(mark < 0)
	                        throw new NegativeMarksException("NegativeMarksException");

	                    if(mark > 100)
	                        throw new MarksOutOfRangeException("MarksOutOfRangeException");

	                    sum += mark;
	                }

	                double avg = sum / 3.0;

	                System.out.println("Average Marks of " + name + " = " + avg);
	            }

	        }

	        catch(NumberFormatException e) {
	            System.out.println("NumberFormatException");
	        }

	        catch(NegativeMarksException e) {
	            System.out.println(e.getMessage());
	        }

	        catch(MarksOutOfRangeException e) {
	            System.out.println(e.getMessage());
	        }

	        finally {
	            sc.close();
	        }
	    }
}
