
// Example of ternary operators in java ...
import java.util.Scanner;

public class Ch_Conditionals_10 {
    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        System.out.print(" Enter your marks : ");
        int marks = zx.nextInt();

        String result = (marks >= 80) ? "Excellent"
                : (marks >= 60) ? "Good"
                        : (marks >= 45) ? "Average"
                                : (marks >= 33) ? "Pass"
                                        : "Fail";
        System.out.println(result);
        zx.close();

    }
}
