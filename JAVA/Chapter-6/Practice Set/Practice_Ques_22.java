/* Question 22 : Find Maximum and Minimum Element in an Array
    Concept: Traverse the array and find the largest and smallest element manually (without sorting).
    Hint: Use two variables — max and min — and update them while looping.
*/
public class Practice_Ques_22 {
    public static void main(String[] args) {
        int[] numbers = { 37, 58, 25, 36, 93, 47, 35, 89, 42, 12, 67, 58, 69, 36, 69 };
        int max = numbers[0];
        int min = numbers[0];
        System.out.println("Array Elements : ");

        for (int num : numbers) {
            System.out.print(num + " ");
        }
        // Finding Maximum and Minimum Elements in the Array

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            } else if (numbers[i] < min) {
                min = numbers[i];
            } else {
                continue;
            }
        }
        System.out.println("\n\nMaximum Element in the Array : " + max);
        System.out.println("Minimum Element in the Array : " + min);
        System.out.println();
    }
}
