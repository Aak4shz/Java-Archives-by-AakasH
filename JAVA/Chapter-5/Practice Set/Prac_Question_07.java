// Write a program to print the multiplication table of given number n in using for loop.

import java.util.Scanner;

public class Prac_Question_07 {
    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        System.out.print("Enter an number : ");
        int n = zx.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        zx.close();
    }
}
