// Question 12 : Sorting an Array (Ascending Order)
// Concept: Use loops (like Bubble Sort or Selection Sort) to arrange numbers from smallest to largest.
public class Practice_Ques_12 {
    public static void main(String[] args) {

        // Original Array
        int[] numbers = { 35, 40, 45, 50, 80, 25,
                85, 90, 95, 5, 10,
                15, 20, 70, 75, 55,
                60, 65, 100, 0, 30, };
        System.out.println("Original Array : ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        // Sorting Array using Bubble Sort
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Swapping elements
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        // Display Sorted Array
        System.out.println("\n\nSorted Array in Ascending Order : ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
