package JavaCodingProblems;

public class StringReversePalindrome {

    public static void main(String[] args) {

        // Input string
        String s = "madam";

        // ✅ 1. Reverse using a manual loop
        String t = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            t = t + s.charAt(i);  // Append characters in reverse order
        }

        System.out.println("Reversed string (manual loop): " + t);

        if (s.equals(t)) {
            System.out.println(s + " is a palindrome (manual check).");
        } else {
            System.out.println(s + " is not a palindrome (manual check).");
        }
        
        System.out.println("===================================");

        // ✅ 2. Reverse using StringBuilder
        String reversed = new StringBuilder(s).reverse().toString();

        System.out.println("Reversed string (StringBuilder): " + reversed);

        if (s.equals(reversed)) {
            System.out.println(s + " is a palindrome (StringBuilder check).");
        } else {
            System.out.println(s + " is not a palindrome (StringBuilder check).");
        }
    }
}
