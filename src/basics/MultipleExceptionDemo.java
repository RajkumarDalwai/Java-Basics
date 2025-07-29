package basics;

public class MultipleExceptionDemo {
    public static void main(String[] args) {
        try {
            // First potential exception: ArithmeticException
            int a = 10;
            int b = 0;
            int result = a / b;  // This will throw ArithmeticException

            // Second potential exception: ArrayIndexOutOfBoundsException
            int[] numbers = new int[5];
            System.out.println(numbers[10]);  // This will throw ArrayIndexOutOfBoundsException

        } catch (ArithmeticException e) {
        	
            System.out.println("Caught ArithmeticException: " + e.getMessage());
            
        } catch (ArrayIndexOutOfBoundsException e) {
        	
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
            
        } catch (Exception e) {
        	
            System.out.println("Caught General Exception: " + e.getMessage());
        }

        System.out.println("Program continues after handling exceptions.");
    }
}
