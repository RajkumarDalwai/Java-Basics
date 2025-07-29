package Strings;

public class ReverseString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String r = "rajkumar"; // Original string

		// Scenario 1: Using Loop (Traditional Approach)

		String s = ""; // Empty string to store reversed value

		for (int i = r.length() - 1; i >= 0; i--) {
			
			s = s + r.charAt(i); // Concatenating characters in reverse order
		}
		
		System.out.println("Scenario 1 (Using Loop): " + s); // Output: ramukjar

		// Scenario 2: Using StringBuilder (Optimized Approach)

		String reversed = new StringBuilder(r).reverse().toString();

		System.out.println("Scenario 2 (Using StringBuilder): " + reversed); // Output: ramukjar
	}
}