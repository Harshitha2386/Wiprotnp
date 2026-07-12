package Sets;
import java.util.TreeSet;
import java.util.Iterator;
public class HandsOnAssignment3 {
	public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("India");
        ts.add("USA");
        ts.add("Japan");
        ts.add("Australia");
        ts.add("Canada");
        System.out.println("Reverse Order:");
        Iterator<String> rev = ts.descendingIterator();
        while (rev.hasNext()) {
            System.out.println(rev.next());
        }
        System.out.println("\nUsing Iterator:");
        Iterator<String> itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        String country = "India";
        if (ts.contains(country)) {
            System.out.println("\n" + country + " exists.");
        } else {
            System.out.println("\n" + country + " does not exist.");
        }
    }
}
