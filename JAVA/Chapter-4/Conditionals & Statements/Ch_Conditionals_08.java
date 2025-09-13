// Example of Nested if program in java ...
import java.util.Scanner;
public class Ch_Conditionals_08 {
    public static void main(String[] args) {
        
        Scanner zx = new Scanner(System.in);
        System.out.print("Enter your marks : ");
        int marks = zx.nextInt();

        if (marks >= 60) {
            System.out.println("Student has passed !");

            if (marks >= 90) {
                System.out.println("Grade : A+ => Excellent !");
            } else if (marks >= 80) {
                System.out.println("Grade : A => Very Good !");
            } else if (marks >= 70) {
                System.out.println("Grade : B => Good !");
            } else {
                System.out.println("grade : C => Average !");
            }
        } else {
            System.out.println("Student has failed !");

            if (marks >= 40) {
                System.out.println("You were Close ! Try Harder Next Time .");
            } else {
                System.out.println("You need to study much more !");
            }
        }
        zx.close();

    }
}
