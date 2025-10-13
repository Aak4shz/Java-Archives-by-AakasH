// Sorting Array Elements >--> Arrays.sort();

import java.util.Arrays;

public class Ch_Array_11 {
    public static void main(String[] args) {
        // Original Array
        int[] Numbers = { 70, 50, 10, 100, 80, 30, 90, 20, 40, 60 };

        // Print Without Sorting
        System.out.println("Original Array : ");
        for (int num : Numbers) {
            System.out.print(num + " ");
        }

        // Print After Sorting Array
        Arrays.sort(Numbers);
        System.out.println("\n\nSorted Array : ");
        for (int num : Numbers) {
            System.out.print(num + " ");
        }
    }
}
