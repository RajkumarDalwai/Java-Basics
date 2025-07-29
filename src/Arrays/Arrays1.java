package Arrays;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[5]; // Declares an array & allocates memory for the values

		a[0] = 2;
		a[1] = 4;
		a[2] = 6;
		a[3] = 8;
		a[4] = 10; // Initialized values into that array

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]); // Retrieve values present in this array
		}
	}
}
