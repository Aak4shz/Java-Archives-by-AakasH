// Print Pyramid Star Pattern using for loops.

public class Ch_Loops_15 {
    public static void main(String[] args) {

        int n = 7;
        for (int i = 1; i <= n; i++) { // print rows
            for (int j = 1; j <= n - i; j++) { // Print spaces
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) { // Print stars
                System.out.print("* ");
            }
            System.out.println();

        }
    }

}
