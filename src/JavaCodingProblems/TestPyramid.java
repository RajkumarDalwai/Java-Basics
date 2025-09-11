package JavaCodingProblems;

public class TestPyramid {

    // Pyramid Pattern Printing in Java

    public static void main(String[] args) {

        // Program to print a pyramid pattern like:
        // 1
        // 2    2
        // 3    3    3
        // 4    4    4    4

        // Outer loop controls the number of rows
        for (int i = 1; i < 5; i++) {

        	// Inner loop prints 'i' times per row
            for (int j = 1; j <= i; j++) {
            	
                System.out.print(i + "\t");  // Print value with tab spacing
            }
            
            System.out.println(); // Move to next line after each row
        }
    }
}
