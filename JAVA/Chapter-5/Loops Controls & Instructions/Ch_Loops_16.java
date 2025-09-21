// Print factorial of a given number using for loops.

import java.util.Scanner;

public class Ch_Loops_16 {
    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = zx.nextInt();

        int fact = 1;
        for (int a = 1; a <= n; a++) {
            fact = fact * a;
        }
        System.out.println("The factorial of " + n + " is : " + fact);
        zx.close();
    }
}
