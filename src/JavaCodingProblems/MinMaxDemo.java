package JavaCodingProblems;

public class MinMaxDemo {

    public static void main(String[] args) {

        // Initialize a 3x3 multidimensional array (matrix)
        int[][] abc = {
            {2, 4, 5},
            {3, 4, 7},
            {1, 2, 9}
        };

        // Assume the first element is the minimum
        int min = abc[0][0];

        // Loop through the matrix to find the minimum value
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                // Update 'min' if a smaller value is found
                if (abc[i][j] < min) {
                    min = abc[i][j];
                }
            }
        }

        // Print the minimum value in the matrix
        System.out.println("Minimum value in the matrix: " + min);
    }
}
