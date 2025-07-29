package Constructor;

public class Constructor {

    // Default constructor
    public Constructor() {
        System.out.println("I am in the constructor");
        System.out.println("I am in the constructor lecture 1");
    }

    // Parameterized constructor with two integers
    public Constructor(int a, int b) {
        System.out.println("I am in the parameterized constructor");
        int c = a + b;
        System.out.println(c);
    }

    // Parameterized constructor with one String
    public Constructor(String str) {
        System.out.println(str);
    }

    // Method (not a constructor)
    public void getData() {
        System.out.println("I am the method");
    }

    // Main method
    public static void main(String[] args) {
        // When object is created, constructor is called automatically
        Constructor cd = new Constructor();               // Calls default constructor
        Constructor cds = new Constructor("hello");       // Calls string parameter constructor
        Constructor c = new Constructor(4, 5);            // Calls int, int parameter constructor

        // If no constructor is defined, compiler provides implicit constructor
        // Constructor name must match class name and should not return any value
    }
}
