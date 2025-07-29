package JavaCollectionsFramework;

import java.util.HashSet;      // Importing HashSet class
import java.util.Iterator;     // Importing Iterator interface

public class HashSetExample {

	public static void main(String[] args) {
	    	
	    	// HashSet Example - Demonstrates use of Set interface and iteration using Iterator

	        // HashSet, TreeSet, LinkedHashSet all implement the Set interface
	        // Set does NOT allow duplicate values
	        // HashSet does NOT maintain any specific order (stores elements in random order)

	        HashSet<String> hs = new HashSet<String>();  // Creating a HashSet of Strings

	        hs.add("USA");      // Add "USA" to the HashSet
	        hs.add("UK");       // Add "UK" to the HashSet
	        hs.add("INDIA");    // Add "INDIA" to the HashSet
	        hs.add("he");       // Add "he" to the HashSet
	        hs.add("she");      // Add "she" to the HashSet
	        hs.add("INDIA");    // Duplicate "INDIA" is ignored (HashSet does not accept duplicates)

	        System.out.println(hs);  // Print all elements of HashSet (order not guaranteed)

	        // System.out.println(hs.remove("UK")); // Optionally remove "UK" from the HashSet

	        System.out.println(hs.isEmpty());  // Check if HashSet is empty → returns false
	        System.out.println(hs.size());     // Print the size (number of unique elements in the HashSet)

	        // Using Iterator to traverse the HashSet
	        Iterator<String> i = hs.iterator();

	        // Loop through all elements using Iterator
	        while (i.hasNext()) {
	            System.out.println(i.next()); // Print each element one by one
	      }
	 }
}
