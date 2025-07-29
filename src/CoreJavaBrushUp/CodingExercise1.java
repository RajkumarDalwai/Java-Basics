package CoreJavaBrushUp;

public class CodingExercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {1, 2, 3, 4, 5};

        // Printing the first and last elements
        System.out.println("First element of the numbers array: " + numbers[0]);
        System.out.println("Last element of the numbers array: " + numbers[numbers.length - 1]);

        // Printing elements in reverse order
        System.out.println("Elements of the numbers array in reverse order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        // Printing the total number of elements
        System.out.println("Total number of elements in the numbers array: " + numbers.length);
	}
}
