package JavaCollectionsFramework;

import java.util.ArrayList;

/**
 * Demonstrates usage of ArrayList in Java.
 * Notes:
 * - Can accept duplicate values
 * - ArrayList, LinkedList, Vector implement the List interface
 * - Arrays have fixed size, whereas ArrayList can grow dynamically
 * - You can access and insert any value at any index
 */
public class ArrayListExample {

    private int i = 5;

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();

        a.add("rahul");
        a.add("java");
        a.add("java"); // duplicate entry allowed

        System.out.println(a); // [rahul, java, java]

        a.add(0, "student"); // insert at index 0
        System.out.println(a); // [student, rahul, java, java]

        // Remove by index or value (commented out for reference)
        /*
        a.remove(1); // removes "rahul"
        a.remove("java"); // removes first occurrence of "java"
        System.out.println(a);
        */

        // Access specific element
        System.out.println(a.get(2)); // Output: java

        // Check if list contains a value
        System.out.println(a.contains("java")); // true

        // Find index of a value
        System.out.println(a.indexOf("rahul")); // 1

        // Check if list is empty
        System.out.println(a.isEmpty()); // false

        // Get the size of the list
        System.out.println(a.size()); // 4
    }
}

