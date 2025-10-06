package JavaCodingProblems;

public class SumOfElements {

    public static void main(String[] args) {

        // Input array
        int[] a = {1, 2, 3, 4, 5};

        // Variable to store the sum of elements
        int sum = 0;

        // Loop through the array and add each element to sum
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }

        // Print the total sum
        System.out.println("Sum of elements present in array is: " + sum);
    }
}
