package JavaCollectionsFramework;

//Problem Statement: Modifying and Analyzing an ArrayList

//1. ArrayList Manipulation:
// - In the main function, modify the ArrayList `a` to contain the elements:
//   "apple", "banana", "cherry", "mango", "apple" (with duplicates).
// - Print the ArrayList after these additions.
//
//2. Element Removal:
// - Remove the first occurrence of "apple" from the ArrayList.
// - Print the ArrayList after the removal.
//
//3. Element Search:
// - Check if the ArrayList contains the element "orange".
// - Print a message indicating whether "orange" is found or not.
//
//4. Size and Content Check:
// - Print the size of the ArrayList.
// - Use a loop to iterate through the ArrayList and print the index and value of each element.

import java.util.ArrayList;

public class ArrayListExercise {
 public static void main(String[] args) {
     ArrayList<String> a = new ArrayList<>();

     // Add elements to the ArrayList
     a.add("apple");
     a.add("banana");
     a.add("cherry");
     a.add("mango");
     a.add("apple");
     
     System.out.println("Original List: " + a);   // Print the ArrayList
   
     a.remove("apple");     // Remove the first occurrence of "apple"

     // Print the ArrayList after removal
     System.out.println("After removing first 'apple': " + a);

     // Check if "orange" is present
     if (a.contains("orange")) {
         System.out.println("orange is found");
     } else {
         System.out.println("orange is not found");
     }

     // Print the size of the ArrayList
     System.out.println("List size: " + a.size());

     // Loop to print index and value of each element
     for (int i = 0; i < a.size(); i++) {
         System.out.println("Index: " + i + ", Value: " + a.get(i));
     }
  }
}
