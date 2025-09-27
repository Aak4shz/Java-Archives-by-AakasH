// Write a program to print the factorial of a number using a loop.

import java.util.Scanner;

public class Prac_Question_09 {
    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = zx.nextInt();

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " is : " + fact);
        zx.close();
    }

}
