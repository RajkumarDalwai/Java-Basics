package JavaCodingProblems;

public class PrimeNumber {

    public static void main(String[] args) {

        // Goal: Check if the given number is a prime number

        int val = 30;  // Number to be checked

        boolean flag = false;  // Default assumption: number is prime

        // Check for factors from 2 to val/2 (no need to go beyond val/2)
        for (int i = 2; i < val / 2; i++) {

            if (val % i == 0) {
                flag = true;  // Found a divisor, so it's not a prime number
                break;        // No need to check further
            }
        }

        // Print result based on the flag
        if (flag)
            System.out.println("It is not prime");
        else
            System.out.println("It is prime");
    }
}
