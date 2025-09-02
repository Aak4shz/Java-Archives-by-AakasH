// Write a program to check whether a number is positive , negative or zero.

import java.util.Scanner;

public class Prac_Qna_11 {
    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = zx.nextInt();

        if (num > 0) {
            System.out.println(num + " is a positive Number .");
        } else if (num < 0) {
            System.out.println(num + " is a negative Number .");
        } else {
            System.out.println(num + " is a Zero Number .");
        }
        zx.close();
    }
}
