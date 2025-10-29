/*
 * Question 14 : Binary Search 
 * Concept: Perform Binary Search on a sorted array. (Hint: Use low, high, mid variables.)
 */

import java.util.Scanner;

public class Practice_Ques_14 {
    public static void main(String[] args) {

        Scanner zx = new Scanner(System.in);
        System.out.print("Enter the Number to Search : ");
        int target = zx.nextInt();

        // A sorted array is required for binary search to work correctly.
        int[] numbers = { 12, 23, 34, 45, 56, 67, 78, 89, 90, 100 };

        // low and high define the current search range (inclusive)
        int low = 0;
        int high = numbers.length - 1;
        boolean found = false;

        // Continue searching while there is a valid range
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // If the middle element is the target, we're done
            if (numbers[mid] == target) {
                System.out.println("Element " + target + " found at index : " + mid);
                found = true;
                break;

            } else if (numbers[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        // If the loop finished without finding the element, report not found
        if (!found) {
            System.out.println("Element " + target + " is not found in the Array .");
        }

        zx.close();
    }
}