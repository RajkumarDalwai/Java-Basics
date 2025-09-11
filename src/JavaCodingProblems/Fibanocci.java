package JavaCodingProblems;

public class Fibanocci {

    public static void main(String[] args) {

        // Goal: Print the first 9 Fibonacci numbers (excluding the first 0)

        int a = 0;  // First number in the Fibonacci sequence
        int b = 1;  // Second number in the Fibonacci sequence
        int sum = 0;
        int i = 1;  // Counter to control loop for 9 numbers

        // Loop to generate next Fibonacci numbers
        while (i < 9) {
            sum = a + b;         // Next number = sum of previous two
            System.out.println(sum);  // Print the current Fibonacci number

            a = b;   // Shift 'a' to the next position
            b = sum; // Shift 'b' to the newly calculated number
            i++;     // Increment loop counter
        }
    }
}
