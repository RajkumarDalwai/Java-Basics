package CoreJavaBrushUp;

public class CoreJavaBrushUp3 {
    public static void main(String[] args) {
        // Declare a string variable
        String s = "Adhirth Rajkumar Dalwai";
        
        // Split the string at "Rajkumar"
        String[] splittedString = s.split("Rajkumar");

        // Print the first and second parts after splitting
        System.out.println(splittedString[0]); // Output: "Adhirth "
        System.out.println(splittedString[1]); // Output: " Dalwai"
        
        // Trim the second part to remove leading spaces and print it
        System.out.println(splittedString[1].trim()); // Output: "Dalwai"

        // Print the string in reverse order character by character
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.println(s.charAt(i));
        }
    }
}
