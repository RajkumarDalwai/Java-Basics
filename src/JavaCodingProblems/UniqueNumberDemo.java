package JavaCodingProblems;

import java.util.ArrayList;

public class UniqueNumberDemo {
    public static void main(String[] args) {
        // Step 1: Create an array with duplicate numbers
        int[] a = {4, 5, 5, 5, 4, 6, 6, 9, 4};

        // Step 2: Create an ArrayList to store numbers already counted
        ArrayList<Integer> al = new ArrayList<>();

        // Step 3: Loop through the array
        for (int i = 0; i < a.length; i++) {

            // Step 4: Process only if number not already checked
            if (!al.contains(a[i])) {
                al.add(a[i]);  // mark the number as processed

                int count = 0;

                // Step 5: Count how many times a[i] appears in the array
                for (int j = i; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        count++;
                    }
                }

                // Step 6: Print the repetition count
                System.out.println(a[i] + " is repeated " + count + " time(s)");

                // Step 7: Check if it's unique
                if (count == 1) {
                    System.out.println(a[i] + " is a unique number");
                }
            }
        }
    }
}
