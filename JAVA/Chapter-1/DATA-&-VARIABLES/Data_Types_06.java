// Demonstrate implicit and explicit type casting between primitive data types.

public class Data_Types_06 {
    public static void main(String[] args) {
        int x = 10;
        double y = x;  // Implicit casting (int → double)
        System.out.println("Implicit casting: " + y);

        double d = 9.78;
        int i = (int) d;  // Explicit casting (double → int)
        System.out.println("Explicit casting: " + i);
    }
}

// Output:
// Implicit casting : 10.0
// Explicit casting : 9