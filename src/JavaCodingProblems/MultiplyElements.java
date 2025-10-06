package JavaCodingProblems;

public class MultiplyElements {

    // Print the multiplication result of two numbers without using the '*' operator.

    public static void main(String[] args) {

        int result = multiply(5, 10);  // Call the multiply method with 5 and 10

        System.out.println("Multiplication Result: " + result);  // Print the result
    }

    // Custom method to multiply two numbers using addition instead of '*'
    private static int multiply(int i, int j) {

        int k = 1;    // Counter to keep track of how many times we've added
        int sum = 0;  // Variable to store the result

        // Loop j times and add i each time to get the product
        while (k <= j) {
            sum = sum + i;
            k++;
        }

        return sum;  // Return the final result
    }
}
