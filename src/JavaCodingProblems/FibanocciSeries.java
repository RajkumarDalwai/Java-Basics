package JavaCodingProblems;

public class FibanocciSeries {

    public static void main(String[] args) {

        // Initialize the first two numbers of the Fibonacci series
        int a = 0;
        int b = 1;

        // Variable to store the sum of previous two numbers
        int sum = 0;

        // Counter to limit the series to 9 numbers
        int i = 1;

        // Loop to generate the Fibonacci series
        while (i < 9) {
            // Calculate next number in the series
            sum = a + b;

            // Print the current number in the series
            System.out.println(sum);

            // Update a and b for next iteration
            a = b;
            b = sum;

            i++;  // Increment the counter
        }
    }
}
