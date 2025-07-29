package JavaCodingProblems;

public class SumOfElements {

    // Create a method which accepts an array and returns the sum of all its elements.

    public static void main(String[] args) {
        
        int[] a = {1, 2, 3, 4, 5};  // Declare and initialize an integer array

        int sum = sumarray(a);     // Call the sumarray method to compute the sum

        System.out.println("Sum Of Array Elements is " + sum);  // Print the result
    }

    // Method to calculate the sum of all elements in the array
    private static int sumarray(int[] a) {
        
        int sum = 0;  // Initialize sum to 0

        // Loop through the array and add each element to sum
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }

        return sum;  // Return the final computed sum
    }
}


/* =========================================== Summary Table ===============================================

| Method     | Visibility | Static?  | Return Type | Purpose                                      |
| ---------- | ---------- | -------- | ----------- | -------------------------------------------- |
| `main`     | `public`   | `static` | `void`      | Entry point of program                       |
| `sumarray` | `private`  | `static` | `int`       | Calculates and returns sum of array elements |

============================================== 📝 Analogy ==================================================

> Think of main() as the main chef starting the cooking process.

> sumarray() is like a helper function that chops and prepares the vegetables (i.e., adds numbers) and gives them back to the chef.

====================================== 🎯 Java Program Structure (Visual) ==================================

+----------------------------+
|     class SumOfElements   |
|----------------------------|
|                            |
|  +----------------------+  |
|  | public static void   |  |
|  | main(String[] args)  |  |   <-- 🚀 JVM starts here
|  |----------------------|  |
|  |  - Declares array     |  |
|  |  - Calls sumarray()   |  |
|  |  - Prints result      |  |
|  +----------------------+  |
|                            |
|  +-------------------------+
|  | private static int      |
|  | sumarray(int[] a)       |   <-- 🔧 Custom method
|  |-------------------------|
|  |  - Loops through array  |
|  |  - Adds elements        |
|  |  - Returns sum          |
|  +-------------------------+
+----------------------------+

================================================================================================================ */