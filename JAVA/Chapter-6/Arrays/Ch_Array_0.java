// Write a program to print all Array Declarations and initialization in Java.
import java.util.Arrays;

public class Ch_Array_0 {
    public static void main(String[] args) {

        // Type 1. Array Declaration then Memory Allocation
        int[] marks1; // Declaration
        marks1 = new int[5]; // Memory Allocation
        marks1[0] = 10;
        marks1[1] = 20;
        marks1[2] = 30;
        marks1[3] = 40;
        marks1[4] = 50;
        // * First declares the array variable, then allocates memory separately.
        // * Useful when you don't know the size immediately.

        // Type 2. Array Declaration and Memory Allocation Together
        int[] marks2 = new int[5]; // Declaration + Memory Allocation
        for (int i = 0; i < marks2.length; i++) {
            marks2[i] = (i + 1) * 11;
        }
        // * Combine declaration and memory allocation in a single line.
        // * Most commonly used approach in Java.

        // Type 3. Array Declaration + Initialization with Values
        int[] marks3 = { 35, 45, 55, 65, 75, 100 };
        // * Array is created and initialized with given values in a single line.
        // * Size is automatically determined by the number of elements.

        // Display all arrays
        System.out.println("Type 1 (Declaration then Allocation): " + Arrays.toString(marks1));
        System.out.println("Type 2 (Declaration + Allocation together): " + Arrays.toString(marks2));
        System.out.println("Type 3 (Declaration + Initialization): " + Arrays.toString(marks3));
        
        // Additional info - Array sizes
        System.out.println("\nArray Sizes:");
        System.out.println("marks1 length: " + marks1.length);
        System.out.println("marks2 length: " + marks2.length);
        System.out.println("marks3 length: " + marks3.length);
    }
}