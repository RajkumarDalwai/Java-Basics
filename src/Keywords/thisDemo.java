package Keywords;

public class thisDemo {
    int a = 2;  // Global variable

    public void getData() {
        int a = 3;  // Local variable (shadowing global)
        
        System.out.println(a);         // Prints 3 (local variable)
        System.out.println(this.a);    // Prints 2 (global variable using 'this')

        int b = a + this.a;            // Sum of local and global
        System.out.println(b);         // Prints 5
    }

    public static void main(String[] args) {
        thisDemo td = new thisDemo();
        td.getData();
    }
}
