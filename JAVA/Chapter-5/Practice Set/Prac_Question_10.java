// Print multiplication table of any number (e.g., 5) using do-while.

import java.util.Scanner;

public class Prac_Question_10 {
    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = zx.nextInt();

        int i = 1;
        do {
            System.out.println(n + " x " + i + " = " + (n * i));
            i++;
        } while (i <= 10);
        zx.close();

    }

}
