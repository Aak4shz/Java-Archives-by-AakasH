// Write a program to classify marks entered by the user into Grade A, B, C, D, Fail.

import java.util.Scanner;

public class Practice_Question_06 {
    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        System.out.print("Enter Your Marks : ");
        int marks = zx.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid Marks Entered." +
                    "\nPlease Enter marks between 0 to 100");
        } else if (marks >= 80) {
            System.out.println("Grade : A");
        } else if (marks >= 60) {
            System.out.println("Grade : B");
        } else if (marks >= 45) {
            System.out.println("Grade : C");
        } else if (marks >= 33) {
            System.out.println("Grade : D");
        } else {
            System.out.println("Grade : Fail");
        }
        zx.close();
    }
}
