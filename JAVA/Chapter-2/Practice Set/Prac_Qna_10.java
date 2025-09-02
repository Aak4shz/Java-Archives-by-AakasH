
/* Write a Java program that takes marks in Math, Physics and Chemistry,
 as input from the user and calculates the total marks and percentage.  */

import java.util.Scanner;

public class Prac_Qna_10 {
    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        System.out.print("Enter Your marks in Math : ");
        int sub1 = zx.nextInt();

        System.out.print("Enter your marks in English : ");
        int sub2 = zx.nextInt();

        System.out.print("Enter your marks in Science : ");
        int sub3 = zx.nextInt();

        System.out.print("Enter your marks in Hindi : ");
        int sub4 = zx.nextInt();

        System.out.print("Enter your marks in Social Science : ");
        int sub5 = zx.nextInt();

        float marks = (sub1 + sub2 + sub3 + sub4 + sub5) / 5.0f;
        System.out.println("Total Percentage of your 5 subjects : " + marks);

        zx.close();

    }
}
