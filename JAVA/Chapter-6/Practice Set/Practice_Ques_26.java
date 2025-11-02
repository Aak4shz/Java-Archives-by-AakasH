/* Question 26 : Using Arrays Class (Built-in Methods)
Concept: Use Java’s Arrays class to:
Sort array (Arrays.sort())
Copy array (Arrays.copyOf())
Compare arrays (Arrays.equals())
Import:import java.util.Arrays; */

import java.lang.reflect.Array;
import java.util.Arrays;

public class Practice_Ques_26 {
    public static void main(String[] args) {
        System.out.println("========== Java Arrays Class Methods Demo ==========\n");

        // ==================== 1. Arrays.sort() Method ====================
        System.out.println("1. Arrays.sort() - Sorting Arrays");
        System.out.println("----------------------------------");

        // Example 1: Sorting integer array
        int[] numbers = { 45, 12, 78, 34, 89, 23, 56 };
        System.out.println("Original Integer Array: " + Arrays.toString(numbers));

        Arrays.sort(numbers); // Sorts in ascending order
        System.out.println("Sorted Integer Array: " + Arrays.toString(numbers));
        System.out.println();

        // Example 2: Sorting String array
        String[] names = { "Raj", "Amit", "Priya", "Neha", "Vikram" };
        System.out.println("Original String Array: " + Arrays.toString(names));

        Arrays.sort(names); // Sorts alphabetically
        System.out.println("Sorted String Array: " + Arrays.toString(names));
        System.out.println();

        // Example 3: Sorting a portion of array
        int[] partialSort = { 50, 30, 70, 10, 90, 40, 60 };
        System.out.println("Original Array: " + Arrays.toString(partialSort));

        Arrays.sort(partialSort, 1, 5); // Sort from index 1 to 4 (5 is exclusive)
        System.out.println("Partially Sorted (index 1-4): " + Arrays.toString(partialSort));
        System.out.println();

        // ==================== 2. Arrays.copyOf() Method ====================
        System.out.println("2. Arrays.copyOf() - Copying Arrays");
        System.out.println("------------------------------------");

        // Example 1: Copy exact length
        int[] original = { 10, 20, 30, 40, 50 };
        System.out.println("Original Array: " + Arrays.toString(original));

        int[] exactCopy = Arrays.copyOf(original, original.length);
        System.out.println("Exact Copy: " + Arrays.toString(exactCopy));
        System.out.println();

        // Example 2: Copy with larger length (pads with 0 for int)
        int[] largerCopy = Arrays.copyOf(original, 8);
        System.out.println("Copy with Larger Length (8): " + Arrays.toString(largerCopy));
        System.out.println();

        // Example 3: Copy with smaller length (truncates)
        int[] smallerCopy = Arrays.copyOf(original, 3);
        System.out.println("Copy with Smaller Length (3): " + Arrays.toString(smallerCopy));
        System.out.println();

        // Example 4: Modifying copy doesn't affect original
        String[] fruits = { "Apple", "Banana", "Orange", "Mango" };
        String[] fruitsCopy = Arrays.copyOf(fruits, fruits.length);

        System.out.println("Original Fruits: " + Arrays.toString(fruits));
        System.out.println("Copied Fruits: " + Arrays.toString(fruitsCopy));

        fruitsCopy[0] = "Grapes"; // Modify the copy
        System.out.println("After modifying copy:");
        System.out.println("Original Fruits: " + Arrays.toString(fruits));
        System.out.println("Modified Copy: " + Arrays.toString(fruitsCopy));
        System.out.println();

        // ==================== 3. Arrays.equals() Method ====================
        System.out.println("3. Arrays.equals() - Comparing Arrays");
        System.out.println("--------------------------------------");

        // Example 1: Equal arrays
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = { 1, 2, 3, 4, 5 };

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Are they equal? " + Arrays.equals(array1, array2));
        System.out.println();

        // Example 2: Different arrays
        int[] array3 = { 1, 2, 3, 4, 5 };
        int[] array4 = { 5, 4, 3, 2, 1 };

        System.out.println("Array 3: " + Arrays.toString(array3));
        System.out.println("Array 4: " + Arrays.toString(array4));
        System.out.println("Are they equal? " + Arrays.equals(array3, array4));
        System.out.println();

        // Example 3: Different length arrays
        int[] array5 = { 1, 2, 3 };
        int[] array6 = { 1, 2, 3, 4, 5 };

        System.out.println("Array 5: " + Arrays.toString(array5));
        System.out.println("Array 6: " + Arrays.toString(array6));
        System.out.println("Are they equal? " + Arrays.equals(array5, array6));
        System.out.println();

        // Example 4: String array comparison
        String[] colors1 = { "Red", "Green", "Blue" };
        String[] colors2 = { "Red", "Green", "Blue" };
        String[] colors3 = { "Red", "Blue", "Green" };

        System.out.println("Colors 1: " + Arrays.toString(colors1));
        System.out.println("Colors 2: " + Arrays.toString(colors2));
        System.out.println("Colors 3: " + Arrays.toString(colors3));
        System.out.println("Colors1 equals Colors2? " + Arrays.equals(colors1, colors2));
        System.out.println("Colors1 equals Colors3? " + Arrays.equals(colors1, colors3));
        System.out.println();

        // ==================== Combined Example ====================
        System.out.println("4. Combined Example - Using All Methods Together");
        System.out.println("--------------------------------------------------");

        int[] dataSet = { 67, 23, 89, 12, 45, 78, 34 };
        System.out.println("Original Dataset: " + Arrays.toString(dataSet));

        // Create a copy
        int[] backupData = Arrays.copyOf(dataSet, dataSet.length);
        System.out.println("Backup Created: " + Arrays.toString(backupData));

        // Sort the original
        Arrays.sort(dataSet);
        System.out.println("Sorted Dataset: " + Arrays.toString(dataSet));

        // Compare sorted with backup
        System.out.println("Is sorted equal to backup? " + Arrays.equals(dataSet, backupData));

        // Sort the backup too
        Arrays.sort(backupData);
        System.out.println("Sorted Backup: " + Arrays.toString(backupData));

        // Compare again
        System.out.println("Are both sorted arrays equal? " + Arrays.equals(dataSet, backupData));

        System.out.println("\n========== Program Completed Successfully ==========");
    }
}
