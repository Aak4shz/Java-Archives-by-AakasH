// Write a program to print sum of factorial given number n using while loop.

import java.util.Scanner;

public class Prac_Question_05 {
    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = zx.nextInt();

        int i = 1;
        int fact = 1;
        while (i <= n) {
            fact *= i;
            i++;
        }
        System.out.println("Factorial of " + n + " is : " + fact);
        zx.close();
    }

}
