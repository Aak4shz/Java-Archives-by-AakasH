/*
Write a program to check whether a number is divisible by both 5 and 11.
*/

import java.util.Scanner;

public class Prac_Qna_06 {
    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = zx.nextInt();

        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println(num + " Divisible by both 5 and 11 .");
        } else {
            System.out.println(num + " Not Divisible by both 5 and 11 .");
        }
        zx.close();
    }
}

/* OUTPUT :- Based on user input.
    Enter the Number :
    55
    55 Divisible by both 5 and 11 .
*/