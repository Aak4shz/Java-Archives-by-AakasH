// Write a program to print multiplication table of given number n using while loop.

import java.util.Scanner;

public class Prac_Question_03 {
    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = zx.nextInt();

        int i = 1;
        while (i <= 10) {
            System.out.println(n + " x " + i + " = " + (n * i));
            i++;
        }
        zx.close();
    }

}
