package JavaCodingProblems;

public class PrintMaxNumberInArray {

    public static void main(String[] args) {

        // Input array
        int[] numbers = {10, 5, 25, 8, 15, 3};

        // Assume the first element is the maximum
        int max = numbers[0];

        // Loop through the array to find the maximum value
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {   // If current element is greater than max
                max = numbers[i];     // Update max
            }
        }

        // Print the maximum number
        System.out.println("Max number from array is: " + max);
    }
}
