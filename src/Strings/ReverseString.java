package Strings;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "madam";

		// Scenario 1: Using a for loop (manual reversal)
		
		String t = "";
		
		for (int i = s.length() - 1; i >= 0; i--) {
			t = t + s.charAt(i);
		}
		System.out.println("Scenario 1 (Manual Reversal): " + t);

		if (s.equals(t)) {
			
			System.out.println("It is a palindrome (Scenario 1)");
			
		} else {
			
			System.out.println("It is not a palindrome (Scenario 1)");
		}

		// Scenario 2: Using StringBuilder (efficient method)
		
		String reversed = new StringBuilder(s).reverse().toString();
		
		System.out.println("Scenario 2 (StringBuilder Reversal): " + reversed);

		if (s.equals(reversed)) {
			
			System.out.println("It is a palindrome (Scenario 2)");
			
		} else {
			
			System.out.println("It is not a palindrome (Scenario 2)");
		}
	}
}
