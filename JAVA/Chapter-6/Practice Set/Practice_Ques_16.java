// Question 16 : Find Duplicate Elements
// Concept: Detect and print elements that appear more than once in an array.

import java.util.Set;
import java.util.HashSet;

public class Practice_Ques_16 {
    public static void main(String[] args) {
        int[] numbers = { 37, 58, 25, 36, 93, 47, 35, 89, 42, 12, 67, 58, 69, 36, 69 };

        // If Array is Empty
        if (numbers.length == 0) {
            System.out.println("The Array is Empty : No Duplicate Elements found. ");
            return;
        }
        // Print Original Array

        System.out.println("Original Array : ");
        for (int num : numbers) { 
            System.out.print(num + " ");
        }

        System.out.println("\nDuplicate Elements in the Array : ");
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        // Finding Duplicates Elements
        for (int num : numbers) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        // Printing Result
        if (duplicates.isEmpty()) {
            System.out.println("No Duplicate Elements found in the Array. ");
        } else {
            for (int dup : duplicates) {
                System.out.print(dup + " ");
            }
        }
    }
}
