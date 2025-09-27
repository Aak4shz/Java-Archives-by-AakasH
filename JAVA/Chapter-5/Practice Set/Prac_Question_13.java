// Check whether a given number is a prime number or not.

import java.util.Scanner;

public class Prac_Question_13 {
    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = zx.nextInt();

        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;

        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(n + " is a Prime Number. ");
        } else
            System.out.println(n + " is Not a Prime Number.");
        zx.close();

    }

}
