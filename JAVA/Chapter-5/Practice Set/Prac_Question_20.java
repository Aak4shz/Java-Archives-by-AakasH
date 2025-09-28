// Write a program to print a Pascal’s Triangle using for loops.

import java.util.Scanner;

public class Prac_Question_20 {
    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int rows = zx.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }

            int num = 1;
            for (int k = 0; k <= i; k++) {
                System.out.print(num + " ");
                num = num * (i - k) / (k + 1);
            }
            System.out.println();
        }
        zx.close();

    }

}
