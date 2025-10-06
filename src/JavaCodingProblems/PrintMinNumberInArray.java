package JavaCodingProblems;

public class PrintMinNumberInArray {

    public static void main(String[] args) {

        // Input array
        int[] numbers = {10, 5, 25, 8, 15, 3};

        // Assume the first element is the minimum
        int min = numbers[0];

        // Loop through the array to find the minimum value
        for (int i = 0; i < numbers.length; i++) {

            // If current element is smaller than min, update min
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        // Print the minimum number
        System.out.println("Min number from array is: " + min);
    }
}
