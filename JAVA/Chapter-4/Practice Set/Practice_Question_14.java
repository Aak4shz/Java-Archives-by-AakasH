// Write a program to check whether a given year is a century leap year 
// (like 2000, 2400 are leap years but 2100, 2200 are not).

import java.util.Scanner;

public class Practice_Question_14 {
    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        System.out.print("Enter a Year : ");
        int year = zx.nextInt();

        if ((year % 400 == 0 && year % 100 == 0) ||
                (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a Century Leap year.");
        } else {
            System.out.println(year + " is not a Century Leap Year.");
        }
        zx.close();

    }
}
