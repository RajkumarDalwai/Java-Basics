package Arrays;

public class MultiDimentionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = new int[2][3];

		a[0][0] = 2;
		a[0][1] = 4;
		a[0][2] = 6;
		a[1][0] = 8;
		a[1][1] = 10;
		a[1][2] = 12;

		int b[][] = { { 2, 4, 6 }, { 8, 10, 12 } }; // Array lateral

		for (int i = 0; i < 2; i++) // row
		{
			for (int j = 0; j < 2; j++) // column
			{
				System.out.println(a[i][j] + " With Method 1");
				System.out.println(b[i][j] + " With Method 2");
			}
		}
	}

}
