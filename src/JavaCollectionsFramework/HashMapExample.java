package JavaCollectionsFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	   public static void main(String[] args) {

	        // Creating a HashMap with Integer keys and String values
	        HashMap<Integer, String> hm = new HashMap<Integer, String>();

	        // Adding key-value pairs to the HashMap
	        hm.put(0, "hello");
	        hm.put(1, "Gudbye");
	        hm.put(42, "morning");
	        hm.put(3, "evening");

	        // Printing the value associated with key 42
	        System.out.println(hm.get(42)); // Output: morning

	        // Removing the key 42
	        hm.remove(42);

	        // Trying to get the value for key 42 again after removal
	        System.out.println(hm.get(42)); // Output: null

	        // Getting the entry set from the HashMap
	        Set sn = hm.entrySet(); // sn = set of all entries (key-value pairs)

	        // Creating an iterator to iterate through the set
	        Iterator it = sn.iterator();

	        // Iterating through the HashMap entries
	        while (it.hasNext()) {
	            // Getting the current entry
	            Map.Entry mp = (Map.Entry) it.next();

	            // Printing key and value separately
	            System.out.println(mp.getKey());
	            System.out.println(mp.getValue());
	        }
	  }
}
