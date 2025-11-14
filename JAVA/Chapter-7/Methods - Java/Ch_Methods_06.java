/*
 *  ==============================>>Methods Overloading with Recursion<<==============================
 *  Create a Java program that demonstrates method overloading with recursion to print different number patterns.
 */
public class Ch_Methods_06 {
    // Method 1.
    static void printPattern(int n) {
        if (n < 1) {
            return;
        }
        System.out.print(n + " ");
        printPattern(n - 1);
    }

    // Method 2.(Overloaded)
    static void printPattern(int start, int end) {
        if (start > end) {
            return;
        }
        System.out.print(start + " ");
        printPattern(start + 1, end);
    }

    // Method 3.(Overloaded)
    static void printPattern(int n, String direction) {
        if (direction.equals("desc")) {
            printDescending(n);
        } else if (direction.equals("asc")) {
            printAscending(1, n);
        }
        System.out.println();
    }

    // Helper method for descending order pattern
    private static void printDescending(int n) {
        if (n < 1) {
            return;
        }
        System.out.print(n + " ");
        printDescending(n - 1);
    }

    // Helper method for ascending order pattern
    private static void printAscending(int start, int end) {
        if (start > end) {
            return;
        }
        System.out.print(start + " ");
        printAscending(start + 1, end);
    }

    public static void main(String[] args) {

        Ch_Methods_06 printer = new Ch_Methods_06();
        System.out.print("Print Pattern 1 : ");
        printer.printPattern(5);
        System.out.println("");

        System.out.print("Print pattern 2 : ");
        printer.printPattern(3, 9);
        System.out.println("");

        System.out.print("Print Pattern 3 : Descending order : ");
        printer.printPattern(10, "desc");

        System.out.print("Print Pattern 4 :  Ascending order : ");
        printer.printPattern(10, "asc");
        System.out.println("\n");
    }

}
