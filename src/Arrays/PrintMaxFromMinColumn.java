package Arrays;

public class PrintMaxFromMinColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print the maximum no. from the identified column belongs to the minimum no.
		// in the matrix

		int a[][] = { { 2, 4, 5 }, { 3, 2, 10 }, { 1, 2, 0 } }; // array lateral

		int min = a[0][0];
		int mincolumn = 0;

		for (int i = 0; i < 3; i++) { // row
			for (int j = 0; j < 3; j++) { // column
				if (a[i][j] < min) {
					min = a[i][j];
					mincolumn = j;
				}
			}
		}

		int max = a[0][mincolumn];
		int k = 0;

		while (k < 3) {
			if (a[k][mincolumn] > max) {
				max = a[k][mincolumn];
			}
			k++;
		}

		System.out.println(max); // Retrieve values present in this array
	}

}
