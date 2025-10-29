// Question 11 : Copying an Array
// Concept: Copy one array into another manually (using a loop) and display both.
public class Practice_Ques_11 {
    public static void main(String[] args) {
        // original Array
        int[] numbers = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100 };

        System.out.println("Original Array : ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Copying Array using a Loop.
        int[] copyArray = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            copyArray[i] = numbers[i];
        }

        // Display copied Array
        System.out.println("\n\nCopied Arrays :  ");

        System.out.println("\nCopying using Loop : ");
        for (int num : copyArray) {
            System.out.print(num + " ");
        }
    }
}
