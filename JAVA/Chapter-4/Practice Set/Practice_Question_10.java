// Write a program to check whether a number is a palindrome or not.
// (Example: 121 → Palindrome, 123 → Not Palindrome)

import java.util.Scanner;

public class Practice_Question_10 {
    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int num = zx.nextInt();

        int original = num;
        int reversed = 0;
        int digit;

        // Loop to reverse the number...
        while (num > 0) {
            digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;

        }
        // check palindrome or not...
        if (original == reversed) {
            System.out.println(original + " is a Palindrome Number .");
        } else {
            System.out.println(original + " is not a Palindrome Number .");
        }
        zx.close();

    }
}
 