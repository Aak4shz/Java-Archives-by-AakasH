// using if else condition in user input

import java.util.Scanner;

public class Ch_Conditionals_03 {
    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int age = zx.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
        zx.close();
    }

}