// Write a recursive method sumOfDigits(int n) that returns the sum of all digits in a number

import java.util.Scanner;

public class Question_13 {
    int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return (n % 10) + sumOfDigits(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        System.out.print("Enter a number to find sum of its digits : ");
        int number = zx.nextInt();
        Question_13 obj = new Question_13();
        int result = obj.sumOfDigits(number);
        System.out.println("Sum of digits in " + number + " is : " + result);
    }

}

/*
 * How this recursion works?
 * Example: n = 4567
 * 
 * 4567 % 10 = 7
 * sumOfDigits(4567 / 10) → sumOfDigits(456)
 * 
 * 456 % 10 = 6
 * sumOfDigits(456 / 10) → sumOfDigits(45)
 * 
 * 45 % 10 = 5
 * sumOfDigits(45 / 10) → sumOfDigits(4)
 * 
 * 4 % 10 = 4
 * sumOfDigits(4 / 10) → sumOfDigits(0)
 * 
 * n == 0 → return 0 (base case)
 * 
 * Now it adds in reverse:
 * 0 + 4 + 5 + 6 + 7 = 22
 * 
 */
