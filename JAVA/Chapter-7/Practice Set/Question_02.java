
/* Write a java program of creating a class HelloWorld with a method greet(String name)
 that prints. ==> Hello <name> ! Have a nice day.
 */

import java.util.Scanner;

public class Question_02 {
    static void greet(String name) {
        System.out.println("Hello " + name);
        System.out.println("Have a nice day ! ");
    }

    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name = zx.nextLine();
        greet(name);
        zx.close();
    }

}
