package JavaCodingProblems;

import java.util.HashMap;

public class CharOccurences {

    public static void main(String[] args) {

        // Input string
        // String str = "INDIA";
        String str1 = "Rajkumar";

        // Convert string to lowercase for case-insensitive counting
        String str = str1.toLowerCase();

        // Create a HashMap to store character counts
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If character exists, increment count; otherwise, initialize with 1
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        // Print the character and its count
        for (char ch : charCount.keySet()) {
            System.out.println(ch + " -> " + charCount.get(ch));
        }
    }
}
