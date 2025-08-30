// Demonstration of all types of operators in Java

public class Operator_Ch_01 {
    public static void main(String[] args) {
         int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators : ");
        System.out.println("a + b = " + (a + b)); // addition operator
        System.out.println("b - a = " + (b - a)); // subtraction operator
        System.out.println("a * b = " + (a * b)); // multiplication operator
        System.out.println("d / a = " + (d / a)); // division operator
        System.out.println("c - a = " + (c - a)); // subtraction operator
        System.out.println("(d + b) / c = " + ((d + b) / c)); // combination of operators
        System.out.println("(a + b + c + d) % b = " + (0)); // combination and modulus operator

        System.out.println("-----------------------------------");

        // Relational Operators
        System.out.println("Relational Operators : ");
        System.out.println("a == b : " + (a == b)); // equality operator
        System.out.println("a != b : " + (a != b)); // not equal operator
        System.out.println("a > b : " + (a > b)); // greater than operator
        System.out.println("a < b : " + (a < b)); // less than operator
        System.out.println("b >= a : " + (b >= a)); // greater than or equal to operator
        System.out.println("b <= a : " + (b <= a)); // less than or equal to operator

        System.out.println("-----------------------------------");

        // Assignment Operators
        System.out.println("Assignment Operators : ");
        int x = a; // simple assignment operator
        System.out.println("x = a : " + x);

        x += b; // addition assignment operator
        System.out.println("x += b : " + x);

        x -= a; // subtraction assignment operator
        System.out.println("x -= a : " + x);

        x *= 2; // multiplication assignment operator
        System.out.println("x *= 2 : " + x);

        x /= 2; // division assignment operator
        System.out.println("x /= 2 : " + x);

        x %= 3; // modulus assignment operator
        System.out.println("x %= 3 : " + x);

        System.out.println("-----------------------------------");

        // Logical Operators
        System.out.println("Logical Operators : ");
        System.out.println("(a < b) && (c > d) : "
                + ((a < b) && (c > d))); // logical AND operator

        System.out.println("(a < b) || (c > d) : "
                + ((a < b) || (c > d))); // logical OR operator

        System.out.println("!(a < b) : " + (!(a < b))); // logical NOT operator

        System.out.println("-----------------------------------");

        // Bitwise Operators
        System.out.println("Bitwise Operators : ");
        System.out.println("a & b : " + (a & b)); // bitwise AND operator
        System.out.println("a | b : " + (a | b)); // bitwise OR operator
        System.out.println("a ^ b : " + (a ^ b)); // bitwise XOR operator
        System.out.println("~a : " + (~a)); // bitwise NOT operator
        System.out.println("a << 2 : " + (a << 2)); // left shift operator
        System.out.println("a >> 2 : " + (a >> 2)); // right shift operator
        System.out.println("a >>> 2 : " + (a >>> 2)); // unsigned right shift operator

        System.out.println("-----------------------------------");

        // Ternary Operator
        System.out.println("Ternary Operator : ");  
        int max = (a > b) ? a : b; // ternary operator
        System.out.println("Max of a and b is : " + max);
        System.out.println("a > b ? a : b = " + ((a > b) ? a : b)); // ternary operator
        System.out.println("-----------------------------------");

    }
}
