package Variables;

public class VariablesExample {

    // Instance Variables (Object level)
    String name;
    String address;

    // Static Variable (Class level)
    static String city = "Bangalore"; // Shared across all instances
    static int counter = 0; // Static variable for sharing across instances

    // Constructor to initialize instance variables
    public VariablesExample(String name, String address) {
        this.name = name; // 'this.name' refers to instance variable, 'name' is the local parameter
        this.address = address;
        
        // Static variable shared across all objects
        counter++; // Increments on each object creation
        System.out.println(counter); // Prints incremented value of counter
    }

    // Instance Method (can access both instance and static variables)
    public void displayAddress() {
        System.out.println(address + ", " + city); // Accesses both instance and static variables
    }

    // Static Method (can only access static variables)
    public static void displayCity() {
        System.out.println(city); // Can only access static variables
    }

    public static void main(String[] args) {
        // Creating objects
        VariablesExample obj1 = new VariablesExample("Bob", "Marthalli");
        VariablesExample obj2 = new VariablesExample("Ram", "Jayanagar");

        // Accessing instance method
        obj1.displayAddress(); // Prints address and city for obj1
        obj2.displayAddress(); // Prints address and city for obj2

        // Accessing static method using class name
        VariablesExample.displayCity(); // Prints static city value
    }
}
