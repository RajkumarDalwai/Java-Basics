package JavaCodingProblems;

public class PrintMinNumberInMatrix {

    public static void main(String[] args) {

        // Initialize a 3x3 multidimensional array (matrix)
        int[][] abc = {
                {2, 4, 5},
                {3, 4, 7},
                {1, 2, 9}
        };

        // Assume the first element is the minimum
        int min = abc[0][0];

        // Loop through each row
        for (int i = 0; i < 3; i++) {

            // Loop through each column in the current row
            for (int j = 0; j < 3; j++) {

                // Compare current element with min
                if (abc[i][j] < min) {
                    min = abc[i][j]; // Update min if smaller value found
                }
            }
        }

        // Print the minimum number
        System.out.println("Minimum number in matrix is: " + min);
    }
}
