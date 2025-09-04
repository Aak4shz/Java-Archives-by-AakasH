/*
* Write a program to check whether a given year is a leap year or not.
*
* This program prompts the user to enter a year and determines if the entered year is a leap year.
* The leap year logic is as follows:
* - A year is a leap year if it is divisible by 4 but not by 100,
*   or if it is divisible by 400.
* The result is displayed to the user.
*/

import java.util.Scanner;
public class Prac_Qna_13 {

    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        System.out.print("Enter a year to check if it is a leap year or not : ");
        int year = zx.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Leap year");

        } else {
            System.out.println("Not a leap year");
        }
        zx.close();
    }

}
/* 
This line of code is a conditional statement that checks whether a given year is a leap year.
 Leap years are determined based on specific rules in the Gregorian calendar,
  and this condition implements those rules.

1. **Understanding the Leap Year Rules**:
   - A year is a leap year if it is divisible by 4.
   - However, if the year is also divisible by 100, it is **not** a leap year unless it is divisible by 400.


2. **Example**:
   - For the year 2000: It is divisible by 4, divisible by 100, and divisible by 400.
    Therefore, it satisfies the `year % 400 == 0` condition and is a leap year.
   - For the year 1900: It is divisible by 4 and divisible by 100, but not divisible by 400.
    Therefore, it is **not** a leap year.
   - For the year 2024: It is divisible by 4 and not divisible by 100,
    so it satisfies the first condition and is a leap year.

This condition is a concise way to implement the leap year logic in code. */