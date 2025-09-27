// Print the sum of digits of a number using do for loop.

import java.util.Scanner;

public class Prac_Question_15 {
    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = zx.nextInt();

        int sum = 0;
        for (int i = n; i > 0; i /= 10) {
            sum += i % 10;
        }
        System.out.println("The sum of digits is : " + sum);
        zx.close();

    }
}
