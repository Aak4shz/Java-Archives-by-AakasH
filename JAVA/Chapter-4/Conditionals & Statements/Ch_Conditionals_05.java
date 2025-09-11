// The Switch Case Statements in java..

import java.util.Scanner;

public class Ch_Conditionals_05 {
    public static void main(String[] args) {
        int age;
        System.out.print("Enter Your Age : ");
        Scanner zx = new Scanner(System.in);
        age = zx.nextInt();

        switch (age) {
            case 16:
                System.out.println("You are a Teenager .");
                break;

            case 22:
                System.out.println("You are became to men .");
                break;

            case 27:
                System.out.println("You are going to a job .");
                break;

            case 30:
                System.out.println("You get to married.");
                break;

            case 60:
                System.out.println("You are going to get Retired.");
                break;

            default:
                System.out.println("Enjoy your life .");
        }
        zx.close();
    }

}

/*
 * When to Use Switch Case:
 * 
 * When you need to check fixed and limited values (like 1, 2, 3… or specific
 * strings).
 * 
 * When there are multiple conditions and using if-else ladder makes the code
 * long and less readable.
 * 
 * When each case requires a different action/statement to be executed.
 * 
 * When you want to improve both performance and readability.
 * 
 * Best suited for menu-driven programs, option selection, fixed input values
 * (like days, months, choices).
 * 
 */