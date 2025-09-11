package JavaCodingProblems;

public class SortArrayDemo {

    // Swap Two Numbers With and Without a Temporary Variable

    public static void main(String[] args) {

        // ✅ 1. Swapping using a temporary variable
        int a = 4;
        int b = 5;
        int temp;

        temp = a;  // Store value of 'a' in temp
        a = b;     // Assign value of 'b' to 'a'
        b = temp;  // Assign stored value in temp to 'b'

        System.out.println("After swap using temp:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // ✅ 2. Swap without using a third variable
        a = a + b;  // a becomes 9
        b = a - b;  // b becomes 4 (original a)
        a = a - b;  // a becomes 5 (original b)

        System.out.println("After swap without temp:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
