package CoreJavaBrushUp;

public class MethodDemo2 {
    public static void main(String[] args) {
        // Creating an object of MethodDemo1 class to call its non-static method
        MethodDemo1 d = new MethodDemo1();

        // Calling the non-static method getData() using the object
        String name = d.getData(); 
        System.out.println(name);  // Printing the returned string

        // Calling the static method getData2() using the class name (no object needed)
        MethodDemo1.getData2();  
    }
}
