// Question 3. WAP to Take 10 integers input from the user and print their sum and average.

import java.util.Scanner;

public class Practice_Ques_03 {

    public static void main(String[] args) {

        // Initialize variables
        int numCount = 10;
        int[] numbers = new int[numCount];
        int sum = 0;

        // Take input from the user
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numCount; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        // Calculate the average
        double average = (double) sum / numCount;

        // Print the sum and average
        System.out.println("\nSum of numbers: " + sum);
        System.out.println("Average of numbers: " + average);
        scanner.close();
        System.out.println();
    }
}