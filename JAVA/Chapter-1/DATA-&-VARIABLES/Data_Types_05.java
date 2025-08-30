// Declare a constant (final variable) in Java and demonstrate its usage.

public class Data_Types_05 {
    public static void main(String[] args) {
        // Declare a constant
        final double PI = 3.14159; // PI is a constant value
        double radius = 7.0;
        double area = PI * radius * radius; // circle area formula
        double perimeter = 2 * PI * radius; // circle perimeter formula

        System.out.println("Area of the Circle : " + area);
        System.out.println("Perimeter of the Circle : " + perimeter);
    }
}

// Output:
// Area of the Circle : 153.938046
// Perimeter of the Circle : 43.98226