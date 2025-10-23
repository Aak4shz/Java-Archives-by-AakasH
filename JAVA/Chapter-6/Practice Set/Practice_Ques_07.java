// Question 7 : Write a program to reverse an array (without using another array)
public class Practice_Ques_07 {
    public static void main(String[] args) {

        // Create an Array
        int[] numbers = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        System.out.println("Original Array Elements : ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        // Reversing Array
        int n = numbers.length;
        for (int i = 0; i < n / 2; i++) {

            // Swap numbers [i] and numbers [ n - i - 1]
            int temp = numbers[i];
            numbers[i] = numbers[n - i - 1];
            numbers[n - i - 1] = temp;

        }
        System.out.println("\nReversed Array Elements : ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}
