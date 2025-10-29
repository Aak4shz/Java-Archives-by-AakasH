// Question 13 : Sorting an Array (Descending Order)
//Concept: Modify sorting logic to arrange numbers from largest to smallest.
public class Practice_Ques_13 {
    public static void main(String[] args) {
        int[] numbers = { 35, 40, 45, 50, 80, 25,
                85, 90, 95, 5, 10,
                15, 20, 70, 75, 55,
                60, 65, 100, 0, 30, };
        System.out.println("Original Array : ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        // Sorting Array in Descending Order using Bubble Sort
        int temp = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println("\n\nSorted Array in Descending Order : ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
