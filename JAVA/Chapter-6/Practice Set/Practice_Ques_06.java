// Question 6 : Write a Program to count even and odd numbers in an array.(Use % Operator)

import java.util.Arrays;

public class Practice_Ques_06 {
    public static void main(String[] args) {
        int[] numbers = { 10, 54, 13, 71, 24, 69, 50, 73, 67, 1, 23, 88, 40, 97, 100 };
        int evenCount = 0;
        int oddCount = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Array Length : " + numbers.length);
        System.out.println("Total Even Numbers : " + evenCount);
        System.out.println("Total Odd Numbers : " + oddCount);

    }
}
