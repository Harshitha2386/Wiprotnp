package Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HandsOnAssignment4 {
	public static void main(String[] args) {
        HashMap<String, Integer> contactList = new HashMap<String, Integer>();
        contactList.put("Harshitha", 12345);
        contactList.put("Ram", 23456);
        contactList.put("Sita", 34567);
        contactList.put("Sai", 45678);
        contactList.put("Sri", 56789);
        if (contactList.containsKey("Harshitha")){
            System.out.println("Key 'Harshitha' exists.");
        } else {
            System.out.println("Key 'Harshitha' does not exist.");
        }
        if (contactList.containsValue(34567)){
            System.out.println("Value '34567' exists.");
        } else {
            System.out.println("Value '34567' does not exist.");
        }
        System.out.println("\nContact List:");
        Iterator<Map.Entry<String, Integer>> itr = contactList.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<String, Integer> entry = itr.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
