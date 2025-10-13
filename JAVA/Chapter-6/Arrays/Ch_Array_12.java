// Searching an Array >--> 1. Liner Search 2. Binary Search

import java.util.Arrays;
import java.util.Scanner;

public class Ch_Array_12 {
    public static void main(String[] args) {
        Scanner zx = new Scanner(System.in);

        // Original Array
        int[] Numbers = { 70, 50, 10, 100, 80, 30, 90, 20, 40, 60 };
        System.out.println("Array Elements : ");
        for (int num : Numbers) {
            System.out.print(num + " ");
        }
        // User Input
        System.out.print("\nEnter the Number to search : ");
        int key = zx.nextInt();

        // Liner Search
        boolean found = false;
        for (int i = 0; i < Numbers.length; i++) {
            if (Numbers[i] == key) {
                System.out.println("Liner Search : Element found at index : " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Liner Search : Element is not found.");

        }

        // Sorting Array
        Arrays.sort(Numbers);
        System.out.println("\nSorted Array Elements : ");
        for (int num : Numbers) {
            System.out.print(num + " ");
        }

        // Binary Search
        int result = Arrays.binarySearch(Numbers, key);
        if (result >= 0) {
            System.out.println("\nBinary Search : Element found at index : " + result);
        } else {
            System.out.println("\nBinary Search: Element is not found.");
        }
        zx.close();

    }
}

/*
 * Liner Search
 * Checks every element one by one.
 * Works on unsorted arrays too.
 * Simple but slower for large arrays.
 *------------------------------------
 * Binary Search
 * Works only on sorted arrays.
 * Repeatedly divides the array in half until the element is found.
 * Much faster for large arrays.
 * 
 */