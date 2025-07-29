package CoreJavaBrushUp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 11, 14, 16, 18, 20};

        // Check if the array has multiples of 2
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i] + " is a multiple of 2");
                break;
            } else {
                System.out.println(arr[i] + " is not a multiple of 2");
            }
        }

        // ArrayList initialization
        ArrayList<String> a = new ArrayList<>();
        a.add("Rajkumar");
        a.add("Basappa");
        a.add("Dalwai");
        a.add("QA");

        System.out.println(a.get(3));

        // Print ArrayList elements using a loop
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }

        System.out.println("************");

        // Enhanced for-loop for printing elements
        for (String s : a) {
            System.out.println(s);
        }

        // Check if an item is present in the ArrayList
        System.out.println(a.contains("QA"));

        // Convert normal array to ArrayList
        String[] name = {"Adhirth", "Rajkumar", "Pooja"};
        List<String> nameArrayList = Arrays.asList(name);

        System.out.println(nameArrayList.contains("QA"));
        System.out.println(nameArrayList.contains("Adhirth"));
    }
}
