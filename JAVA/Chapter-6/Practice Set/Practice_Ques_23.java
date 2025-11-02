/*
 Question 23 : Reverse an Array
 Concept: Reverse all the elements of an array using a loop.
 Hint: Use two pointers (start and end) and swap until they meet. 
 */
public class Practice_Ques_23 {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        System.out.println("Original Array : ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        // Reversing the Array
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
        // Printing the Reversed Array 
        System.out.println("\n\nReversed Array : ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
    }

}
