// Switch Case Statement in Modern Java..with user input .

// import java.util.Scanner;

public class Ch_Conditionals_06 {

    public static void main(String[] args) {

        System.out.print("Enter the Number : ");
        // Scanner zx = new Scanner(System.in);
        // String day = zx.nextLine();
        String day = "3";

        String result = switch (day) {
            case "1" -> "Monday";
            case "2" -> "Tuesday";
            case "3" -> "Wednesday";
            case "4" -> "Thursday";
            case "5" -> "Friday";
            case "6" -> "Saturday";
            case "7" -> "Sunday";
            default -> "Invalid Day";
        };
        System.out.println(result);
        // zx.close();
    }
}

/*
 * This code runs without user input and also runs with user input.
 * To run with user input, uncomment the lines below and comment out the line
 * "String day = 3;" above.
 */