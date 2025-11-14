
/*  Write a Java program that uses a method named display() to print a message.
 *   The program should take the user’s name as input, and the display() method should print:
 *   "Hello <name> Welcome to Java Methods". 
 */

import java.util.Scanner;

public class Question_01 {
    static void display(String name) {
        System.out.println("Hello " + name);
        System.out.println("Welcome to Java Methods !");
    }

    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = zx.nextLine();

        display(name);
        zx.close();

    }

}
