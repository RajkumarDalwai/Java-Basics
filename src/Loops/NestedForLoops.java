package Loops;

public class NestedForLoops {

    // Example 1: Printing 2D array elements
    public static void main(String[] args) {
        int arr[][] = { {2, 7, 9}, {3, 6, 1}, {7, 4, 2} };

        System.out.println("Example 1: Printing 2D Array Elements\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }

        // Example 2: Demonstrating nested loops with outer and inner loops
        System.out.println("\nExample 2: Demonstrating Outer and Inner Loops\n");
        for (int i = 1; i <= 4; i++) { // Outer loop runs 4 times
            System.out.println("Outer loop started");
            for (int j = 1; j <= 4; j++) { // Inner loop runs 4 times per outer loop
                System.out.print("Inner loop, i=" + i + ", j=" + j + " ");
            }
            System.out.println(); // Move to next line after inner loop
            System.out.println("Outer loop finished");
        }

        // Example 3: Nested pattern printing
        System.out.println("\nExample 3: Nested Pattern Printing\n");
        printNestedPattern();

        // Example 4: loop2demo pattern printing
        System.out.println("\nExample 4: loop2demo Pattern Printing\n");
        printLoop2Demo();
    }

    // Method for the nested pattern logic from NestedPattern class
    public static void printNestedPattern() {
        int k = 1; // Counter starts from 1

        for (int i = 0; i < 4; i++) { // Outer loop (4 rows)
            for (int j = 1; j <= 4 - i; j++) { // Inner loop (decreasing numbers)
                System.out.print(k + "\t"); // Print number with a tab space
                k++; // Increment counter
            }
            System.out.println(); // Move to next line after inner loop finishes
        }
    }

    // Method for the loop2demo logic
    public static void printLoop2Demo() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}