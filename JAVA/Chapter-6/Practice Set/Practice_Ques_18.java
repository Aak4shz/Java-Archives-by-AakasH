// Remove Duplicate Elements >>==>> Using HashSet Class
//  Concept: Create a new array containing only unique elements.

import java.util.HashSet;

public class Practice_Ques_18 {
    public static void main(String[] args) {
        int[] numbers = { 37, 58, 25, 36, 93, 47, 35, 89, 42, 12, 67, 58, 69, 36, 69 };

        System.out.println("Original Array :  ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        // Create HashSet to Store Unique Elements
        HashSet<Integer> uniqueSet = new HashSet<>();
        HashSet<Integer> duplicateSet = new HashSet<>();

        // Create Traverse and Detect Duplicates

        for (int num : numbers) {
            if (!uniqueSet.add(num)) {
                duplicateSet.add(num);
            }
        }
        // Print Unique Elements
        System.out.println("\n\nArray after Removing Duplicates : ");
        for (int num : uniqueSet) {
            System.out.print(num + " ");
        }

        // Print Duplicates Elements
        System.out.println("\n\nDuplicates Elements Found are : ");
        if (duplicateSet.isEmpty()) {
            System.out.println("No Duplicates Found in the Array.");
        } else {
            for (int num : duplicateSet) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\n");
    }
}

// Question No 17 & 18 are similar but use different approaches.