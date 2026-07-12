package Sets;
import java.util.HashSet;
import java.util.Iterator;
public class HnadsOnAssignment2 {
	public static void main(String[] args) {
        HashSet<String> employees = new HashSet<String>();
        employees.add("Harshitha");
        employees.add("Ram");
        employees.add("Sita");
        employees.add("Sai");
        employees.add("Sri");
        System.out.println("Employee Names:");
        Iterator<String> itr = employees.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
