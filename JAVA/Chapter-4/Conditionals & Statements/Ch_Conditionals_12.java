// Example of Logical OR Operators in java...

import java.util.Scanner;
public class Ch_Conditionals_12 {
    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        System.out.println("Enter your Practical marks :");
        int marks = zx.nextInt();
        boolean giveMoney = true;

        // Use of Logical OR Operator -> || 
        if (marks >= 33 || (marks < 33 && giveMoney)){
            System.out.println("You passed the exam .");
        }
        else {
            System.out.println("You failed the exam .");
        }
        zx.close();
    }
}
