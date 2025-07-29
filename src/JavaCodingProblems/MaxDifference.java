package JavaCodingProblems;

public class MaxDifference {

    // Java Program to Find Maximum Difference Between Any Adjacent Index in an Array

    public static void main(String[] args) {

        int[] a = {1, 4, 8, 15, 17};  // Input array

        int diff = 0;  // Variable to store the maximum difference

        // Loop through array until the second last index
        for (int i = 0; i < a.length - 1; i++) {

            // Check if current adjacent difference is greater than previous max
            if ((a[i + 1] - a[i]) > diff) {
                diff = a[i + 1] - a[i];  // Update max difference
            }
        }

        // Print the maximum difference found
        System.out.println("Maximum Difference is " + diff);
    }
}
