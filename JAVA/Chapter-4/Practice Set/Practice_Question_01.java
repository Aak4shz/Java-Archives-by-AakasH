// Write a Program to check whether a number is even or odd.
import java.util.Scanner;

public class Practice_Question_01 {
    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int num = zx.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " Is Even Number.");
        } else {
            System.out.println(num + " is Odd Number.");
        }
        zx.close();
    }

}
