package JavaCodingProblems;

public class BubbleSort {

    // Sort an Array Using Bubble Sort Logic

    public static void main(String[] args) {

        int[] a = {6, 2, 1, 4, 9};  // Input array to be sorted

        // Bubble Sort logic
        for (int i = 0; i < a.length - 1; i++) {

            for (int j = i + 1; j < a.length; j++) {

                // Swap if the current element is greater than the next
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println("Sorted array is:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
