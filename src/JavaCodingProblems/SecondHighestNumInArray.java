package JavaCodingProblems;

import java.util.Arrays;

public class SecondHighestNumInArray {
	
	public static void main (String[] args) {
		
	// Program to find the second highest element in an array
		
		int[] a = {1, 2, 3, 4, 5};
		
		// Method 1 : Using for loop with if & else 
		
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		
		for(int i =0; i < a.length; i++) {
			
			if (a[i] > highest) {
				
				secondHighest = highest;
				highest = a[i];
				
			} else if (a[i] > secondHighest && a[i] != highest) {
				secondHighest = a[i];
			}

		}
		
		System.out.println("Highest number: " + highest);
	    System.out.println("Second highest number: " + secondHighest);
	    
	    // Method 2 : Using Arrays.sort() (Built-in Sorting)
	    
	    Arrays.sort(a);
	    
	    System.out.println("Second highest number Using Arrays.sort() (Built-in Sorting) : " + a[a.length-2]);
   
	}

}



