/* Write a program with a method evenOdd(int num) that prints whether the number is even or odd. */

import java.util.Scanner;

public class Question_05 {
    static void evenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is Even Number.");
        } else {
            System.out.println(num + " is Odd Number");
        }
    }
    
    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = zx.nextInt();
        evenOdd(num);
        zx.close();
    }

}
