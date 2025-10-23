// Question 5. Write a Java program to search for an element (Linear Search).

import java.util.Scanner;

public class Practice_Ques_05 {
    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);
        int[] numbers = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        System.out.println("Array Elements : ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.print("\nEnter the number to search : ");
        int key = zx.nextInt();

        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                System.out.println("Linear Search : Element found at index : " + i);
                found = true;
                break;

            }
        }
        if (!found) {
            System.out.println("Linear Search : Element is not found .");

        }
        System.out.println();
        zx.close();

    }
}
