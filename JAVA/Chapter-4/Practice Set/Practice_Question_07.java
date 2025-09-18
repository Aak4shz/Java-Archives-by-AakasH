// Write a program to check whether a character entered is a vowel or consonant.

import java.util.Scanner;

public class Practice_Question_07 {
    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        System.out.print("Enter The Character :");
        char ch = zx.next().toLowerCase().charAt(0);
        if ((ch < 'a' || ch > 'z')) {
            System.out.println(ch + " is a invalid Character .");
        } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is Vowel .");
        } else {
            System.out.println(ch + " is Consonant .");
        }

        zx.close();
    }
}
