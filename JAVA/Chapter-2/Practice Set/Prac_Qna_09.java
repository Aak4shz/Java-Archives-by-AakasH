/* Write a Java program that takes the total marks and percentage as input from the user,
 then calculates and displays the marks obtained. */

import java.util.Scanner;

public class Prac_Qna_09 {
    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        System.out.println("Convert Percentage to Marks : ");
        double totalMarks = zx.nextDouble();

        System.out.println("Enter the Percentage : ");
        double percentage = zx.nextDouble();

        double marks = (percentage / 100) * totalMarks;
        System.out.println("Marks Obtained : " + marks);

        zx.close();

    }
}
