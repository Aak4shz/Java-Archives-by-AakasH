// Factorial of a number using do-while.

import java.util.Scanner;

public class Ch_Loops_09 {
    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = zx.nextInt();

        int i = 1;
        int fact = 1;
        do {
            fact *= i;
            i++;
        } while (i <= n);
        System.out.println("The factorial of " + n + " is : " + fact);
        zx.close();

    }
}
