package JavaCodingProblems;

import java.util.ArrayList;

public class CompareArray {

    // Compare elements at the same indexes of two different arrays and
    // create another array (or list) to store matching values

    public static void main(String[] args) {

        int[] a = {1, 4, 5, 7};  // First array
        int[] b = {6, 4, 3, 7};  // Second array

        ArrayList<Integer> ab = new ArrayList<Integer>();  // List to store matching values

        // Compare elements at the same index
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) {
                ab.add(a[i]);  // Add to list if matching
            }
        }

        // Convert list to array (optional, if needed elsewhere)
        Object[] c = ab.toArray();

        // Print matching values
        System.out.println("Matching values at same index:");
        for (Object obj : c) {
            System.out.println(obj);
        }
    }
}
