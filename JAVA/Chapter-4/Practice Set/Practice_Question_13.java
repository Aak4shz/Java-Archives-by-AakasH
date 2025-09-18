/* Write a program to calculate electricity bill using conditions:
   For first 100 units: ₹5 per unit
   For next 100 units: ₹7 per unit
   For above 200 units: ₹10 per unit */

import java.util.Scanner;

public class Practice_Question_13 {
    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        System.out.print("Enter the Number of Units :");
        int units = zx.nextInt();

        int bill = 0;
        if (units <= 100) {
            bill = units * 5;

        } else if (units <= 200) {
            bill = 100 * 5 + (units - 100) * 7;
        } else {
            bill = 100 * 5 + 100 * 7 + (units - 200) * 10;
        }
        System.out.println("Your Total Bill is : " + bill);
        zx.close();

    }
}
