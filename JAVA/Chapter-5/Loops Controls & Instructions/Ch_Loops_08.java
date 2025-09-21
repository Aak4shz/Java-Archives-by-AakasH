// Print the multiplication table of a number entered by the user.

import java.util.Scanner;

public class Ch_Loops_08 {
    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = zx.nextInt();

        int i = 1;
        do {
            System.out.println(n + " x  " + i + " = " + (n * i));
            i++;
        } while (i <= 10);
        zx.close();
    }
}
