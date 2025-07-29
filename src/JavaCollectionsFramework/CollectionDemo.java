package JavaCollectionsFramework;

import java.util.ArrayList;

public class CollectionDemo {

	    public static void main(String[] args) {

	        // Input array with duplicate numbers
	        int a[] = {4, 5, 5, 5, 4, 6, 6, 9, 4};

	        // Create an ArrayList to track numbers already processed
	        ArrayList<Integer> ab = new ArrayList<Integer>();

	        // Outer loop to traverse each element of the array
	        for (int i = 0; i < a.length; i++) {

	            int k = 0; // Counter to track how many times the current number appears

	            // Check if the current number has already been processed
	            
	            if (!ab.contains(a[i])) {
	            	
	                ab.add(a[i]); // Add number to ArrayList so it's not processed again
	                
	                k++; // Initial count for current number (count itself)

	                // Inner loop to check the rest of the array for the same number
	                for (int j = i + 1; j < a.length; j++) {
	                	
	                    if (a[i] == a[j]) {
	                    	
	                        k++; // Increment count if duplicate is found
	                    }
	                }

	                // If the number appears only once in the array, it's unique
	                if (k == 1)
	                	
	                    System.out.println(a[i] + " is unique number");
	            }
	      }
	 }
}
