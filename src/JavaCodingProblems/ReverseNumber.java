package JavaCodingProblems;

public class ReverseNumber {

    public static void main(String[] args) {

        // Input number to be reversed
        int number = 12345;

        // Variable to store the reversed number
        int reversed = 0;

        // Loop until the number becomes 0
        while (number != 0) {

            // Extract the last digit
            int digit = number % 10;

            // Append the digit to the reversed number
            reversed = reversed * 10 + digit;

            // Remove the last digit from the original number
            number = number / 10;
        }

        // Print the reversed number
        System.out.println("Reversed Number: " + reversed);
    }
}

/*

⚡ **Key Idea**:

* `% 10` → extracts the last digit.
* `/ 10` → removes the last digit.
* `reversed = reversed * 10 + digit` → shifts previous digits left and adds the new digit at the end.

*/
