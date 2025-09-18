// Write a Program to check whether a number is positive , negative or zero.

import java.util.Scanner;

public class Practice_Question_03 {
    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int num = zx.nextInt();
        if (num > 0) {
            System.out.println(num + " Is Positive Number.");
        } else if (num < 0) {
            System.out.println(num + " Is Negative Number.");
        } else {
            System.out.println("The Number is Zero.");
        }
        zx.close();
    }

}
