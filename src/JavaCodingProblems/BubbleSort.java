package JavaCodingProblems;

public class BubbleSort {

    public static void main(String[] args) {

        // Input array to be sorted
        int[] a = {6, 2, 1, 4, 9};

        // Outer loop for each element in the array
        for (int i = 0; i < a.length - 1; i++) {

            // Inner loop compares current element with the rest of the elements
            for (int j = i + 1; j < a.length; j++) {

                // If the current element is greater than the next element, swap them
                if (a[i] > a[j]) {
                    int temp = a[i];  // Store current element in a temporary variable
                    a[i] = a[j];      // Replace current element with smaller element
                    a[j] = temp;      // Assign temporary variable to the next element
                }
            }
        }

        // Print the sorted array
        System.out.println("Sorted array is: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
