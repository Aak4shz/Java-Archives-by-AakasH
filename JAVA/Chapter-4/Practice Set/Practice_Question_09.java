// Write a program to print the day of the week (1 → Monday … 7 → Sunday) using switch.

import java.util.Scanner;

public class Practice_Question_09 {
    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        System.out.print("Enter a number between 1 to 7 : ");
        int day = zx.nextInt();

        String result = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid Day";
        };
        System.out.println(result);
        zx.close();
    }
}
