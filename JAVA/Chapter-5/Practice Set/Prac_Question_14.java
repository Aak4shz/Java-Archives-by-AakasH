// Write a program to count the digits of a given number.

import java.util.Scanner;

public class Prac_Question_14 {
    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = zx.nextInt();

        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }

        System.out.println("The number of digits is : " + count);
        zx.close();

    }

}
