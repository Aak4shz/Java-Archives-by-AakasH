// Create a program with a method reverseString(String line) that returns the reversed string.

import java.util.Scanner;

public class Question_19 {
    static String reverseString(String line) {
        String reversed = "";
        for (int i = line.length() - 1; i >= 0; i--) {
            reversed = reversed + line.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        System.out.print("Enter a string to reverse in : ");
        String line = zx.nextLine();
        String result = reverseString(line);
        System.out.println("Reversed String is : " + result);
        zx.close();
    }
}