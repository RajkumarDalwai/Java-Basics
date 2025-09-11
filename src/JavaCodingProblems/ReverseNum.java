package JavaCodingProblems;

public class ReverseNum {

    public static void main(String[] args) {
    	
        int a = 543;
        int reversed = 0;

        while (a != 0) {
        	
            int digit = a % 10;               // Get the last digit
            reversed = reversed * 10 + digit; // Add digit to reversed number
            a = a / 10;                       // Remove the last digit from original number
        }

        System.out.println("Reversed number: " + reversed);
    }
}
