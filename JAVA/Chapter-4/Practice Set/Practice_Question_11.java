// Write a program to check whether a number is prime or not.

import java.util.Scanner;

public class Practice_Question_11 {
    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = zx.nextInt();

        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;

        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        zx.close();
    }

}
