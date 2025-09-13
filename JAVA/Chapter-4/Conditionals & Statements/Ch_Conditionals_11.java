// Logical Operators in java ...
public class Ch_Conditionals_11 {
    public static void main(String[] args) {
        // Use of AND Operators -> &&
        int age = 20;
        boolean Indian = true;

        if (age >= 18 && Indian) { 
            System.out.println("you are eligible to vote.");
        } else if (age < 18 && Indian) {
            System.out.println("You have to time to vote and this time you can't vote .");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
}