// Write a Program to find the largest of three numbers.

import java.util.Scanner;

public class Practice_Question_04 {
    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        System.out.print("Enter the first Number : ");
        int num1 = zx.nextInt();
        System.out.print("Enter the second Number : ");
        int num2 = zx.nextInt();
        System.out.print("Enter the third Number : ");
        int num3 = zx.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("All the three numbers are equal.");

        } else if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " Is the Largest Number .");

        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " Is the Largest Number .");

        } else {
            System.out.println(num3 + " Is the Largest Number .");
        }
        zx.close();

    }

}
