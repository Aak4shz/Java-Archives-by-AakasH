// Question 1. Write a Java Program to store 5 numbers in an array and print them.
public class Practice_Ques_01 {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };
        System.out.println("Array Elements : ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nLength of Array : " + numbers.length);

    }
}
