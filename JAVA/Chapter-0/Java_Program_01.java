// Simple Java program to demonstrate taking user input and displaying a personalized message.

import java.util.Scanner;
// Give access to Scanner class.

    public class Java_Program_01 {
        // class declaration
        public static void main(String[] args) {
            // Start point of program

        Scanner sc = new Scanner(System.in);
        // create a Scanner object.

        System.out.println("Enter Your name : " );
        // Ask the user for input

        String name = sc.nextLine();
        // Read a line of text

        System.out.println("Enter your age : ");
        // Ask the user for input

        int age = sc.nextInt();
        // Read an Integer 

        System.out.println("Hello, " + name + " \nYou are " + age + "years old .");
        // Display the input back 

        sc.close();
        // close the Scanner 
    }
}
