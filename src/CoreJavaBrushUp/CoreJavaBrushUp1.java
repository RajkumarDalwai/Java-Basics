package CoreJavaBrushUp;

public class CoreJavaBrushUp1 {
    public static void main(String[] args) {
        // Variable declaration and initialization
        int z = 5;
        String website = "https://www.tractorjunction.com/";
        char y = 'r';
        double dec = 5.99;
        boolean myCard = true;

        // Printing variables
        System.out.println(z + " is my number");
        System.out.println(website + " is my website");

        // Arrays - Method 1: Declaring an array and assigning values individually
        int[] a = new int[5];
        a[0] = 2;
        a[1] = 4;
        a[2] = 6;
        a[3] = 8;
        a[4] = 10;

        // Arrays - Method 2: Directly initializing an array with values
        int[] b = {12, 14, 16, 18, 20};

        // Accessing specific elements from the arrays
        System.out.println(a[2] + " With Method 1");
        System.out.println(b[2] + " With Method 2");

        // Printing all values from the 'a' array using a for loop
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " With Method 1");
        }

        // Printing all values from the 'b' array using a for loop
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i] + " With Method 2");
        }

        // String array declaration and initialization
        String[] name = {"Adhirth", "Rajkumar", "Pooja"};

        // Printing all values from the String array
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i] + " Printing Strings stored in Array");
        }

        // Enhanced for loop for printing strings
        for (String s : name) {
            System.out.println(s + " Printing Strings with Enhanced for loop");
        }
    }
}
