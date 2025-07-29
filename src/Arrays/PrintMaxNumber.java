package Arrays;

public class PrintMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Print maximum no from below matrix

		int a[][] = { { 2, 4, 6 }, { 6, 2, 10 }, { 1, 5, 12 } };

		int max = a[0][0];

		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 3; j++) {
				
				if (a[i][j] > max) {
					
					max = a[i][j];
				}
			}
		}
		
		System.out.println(max);
	}
}
