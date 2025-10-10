// Types Of Arrays in Java
// One-Dimensional Array 
// Two Dimensional Array or
// Jagged Array

public class Ch_Array_6 {
    public static void main(String[] args) {
        // One - Dimensional Array
        int[] marks = { 88, 75, 82, 90, 68, 80 };

        // Print marks
        System.out.println("Students Marks : ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + " : " + marks[i]);
        }

        // Total Marks
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        System.out.println("\nTotal Marks : " + sum);
        System.out.println("Number of Subjects : " + marks.length);
    }
}
