package Keywords;

public class FinalKeywordExample {

    // Final Variable (Constant)
    final int MAX_AGE = 100; // This value cannot be changed after initialization

    // Final Method
    public final void displayMessage() {
        System.out.println("This is a final method. It cannot be overridden.");
    }

    // Final Class - Cannot be inherited
    public final class FinalInnerClass {
        public void display() {
            System.out.println("This is a final inner class.");
        }
    }

    public static void main(String[] args) {
        // Final Variable Example
        FinalKeywordExample example = new FinalKeywordExample();
        System.out.println("Maximum Age: " + example.MAX_AGE);

        // Final Method Example
        example.displayMessage();

        // Attempting to modify final variable (will give an error)
        // example.MAX_AGE = 120; // Uncommenting this will result in an error

        // Final Inner Class Example
        FinalInnerClass innerClass = example.new FinalInnerClass();
        innerClass.display();
        
        // Trying to extend a final class would give an error
        // class ChildClass extends FinalInnerClass { } // Uncommenting will result in an error
    }
}
