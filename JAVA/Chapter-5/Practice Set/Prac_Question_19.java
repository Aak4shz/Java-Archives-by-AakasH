// Check whether a given number is a Palindrome (same forward & backward).

import java.util.Scanner;

public class Prac_Question_19 {
    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = zx.nextInt();

        int rev = 0, rem = 0;
        int temp = n;
        while (temp > 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if (n == rev) {
            System.out.println(n + " is a Palindrome Number.");
        } else {
            System.out.println(n + " is not a Palindrome Number.");
        }
        zx.close();
    }

}
