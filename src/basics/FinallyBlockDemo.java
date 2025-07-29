package basics;

public class FinallyBlockDemo {
	
    public static void main(String[] args) {
    	
        try {
        	
            System.out.println("Inside try block");
            
            int result = 10 / 0;  // This will throw ArithmeticException
            
            System.out.println("Result: " + result); // This won't execute
            
        } catch (ArithmeticException e) {
        	
            System.out.println("Caught Exception: " + e.getMessage());
            
        } finally {
        	
            System.out.println("Inside finally block - Cleanup actions like closing browser or deleting cookies");
        }

        System.out.println("Program continues after try-catch-finally");
    }
}
