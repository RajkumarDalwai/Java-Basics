package JavaCodingProblems;

public class CountStringOccurence {

    public static void main(String[] args) {

        // Count the number of times a character appears in a given string
        int count = countOccurences("aaanjd", 'a');

        // Print the total number of occurrences
        System.out.println("The character 'a' occurred " + count + " time(s).");
    }

    // Method to count how many times character 'c' appears in the string 'word'
    private static int countOccurences(String word, char c) {

        int count = 0;

        // Loop through each character of the string
        for (int i = 0; i < word.length(); i++) {

            // If the current character matches the given character, increment the count
            if (word.charAt(i) == c) {
                count++;
            }
        }

        return count;  // Return the final count
    }
}
