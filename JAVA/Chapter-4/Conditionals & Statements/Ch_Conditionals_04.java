// The Else-if Ladder in Java..

import java.util.Scanner;
public class Ch_Conditionals_04 {
    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int age = zx.nextInt();
        if (age >= 55) {
            System.out.println("You are an old.");

        } else if (age >= 40) {
            System.out.println("You are became family man.");

        } else if (age >= 30) {
            System.out.println("You are a Man ");

        } else if (age >= 20) {
            System.out.println("You are an Adult.");

        } else if (age >= 14) {
            System.out.println("You are a Minor.");
        } else {
            System.out.println("You are a Child.");
        }
        zx.close();

    }
}

/* Program checks each condition from top to bottom;
   executes the first true block, then skips the rest. 
 */
