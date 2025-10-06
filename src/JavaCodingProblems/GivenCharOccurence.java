package JavaCodingProblems;

public class GivenCharOccurence {

    public static void main(String[] args) {

        // Input string
        String str = "automation";

        // Character to count in the string
        char target = 'a';

        // Counter to store the number of occurrences
        int count = 0;

        // Loop through each character of the string
        for (int i = 0; i < str.length(); i++) {

            // If the current character matches the target, increment count
            if (str.charAt(i) == target) {
                count++;
            }
        }

        // Print the number of occurrences of the target character
        System.out.println("Character occurrence for char '" + target + "' is: " + count);
    }
}
