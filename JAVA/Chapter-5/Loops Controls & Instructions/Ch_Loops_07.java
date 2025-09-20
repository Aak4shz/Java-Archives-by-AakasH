// Find the sum of first N natural numbers using do while loops. (N given by user).

import java.util.Scanner;

public class Ch_Loops_07 {
    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = zx.nextInt();

        int i = 1;
        int sum = 0;
        do {
            sum += i; 
            i++;

        } while (i <= n);
        System.out.println("The sum of the first " + n +
                " natural number is : " + sum);
        zx.close();
    }

}
