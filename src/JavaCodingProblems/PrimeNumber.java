package JavaCodingProblems;

public class PrimeNumber {

    public static void main(String[] args) {

        // A prime number is a number greater than 1
        // that can be divided only by 1 and itself.

        int value = 30;
        // int value = 29;  // You can test with another number

        // Assume number is prime unless proven otherwise
        boolean isPrime = true;

        // Check divisibility from 2 up to value/2
        for (int i = 2; i < value / 2; i++) {
            if (value % i == 0) {   // If divisible by any number, not prime
                isPrime = false;
                break;  // No need to check further
            }
        }

        // Print the result
        if (isPrime) {
            System.out.println(value + " : is a prime number");
        } else {
            System.out.println(value + " : is not a prime number");
        }
    }
}
