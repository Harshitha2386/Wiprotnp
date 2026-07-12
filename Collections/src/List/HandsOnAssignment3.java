package List;
import java.util.ArrayList;
import java.util.Iterator;

public class HandsOnAssignment3 {
	public static void printAll(ArrayList<String> list){
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        list.add("Orange");
        list.add("Kiwi");
        System.out.println("ArrayList Elements:");
        printAll(list);
    }
}
