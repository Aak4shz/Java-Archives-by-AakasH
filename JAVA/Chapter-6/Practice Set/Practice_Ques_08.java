// Question 8 : Program to find the sum of all elements at even and odd indices separately.
public class Practice_Ques_08 {
    public static void main(String[] args) {
        int[] numbers = { 12, 53, 46, 72, 19, 10, 36, 69, 73, 88, 100 };
        int evenIndexSum = 0;
        int oddIndexSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                evenIndexSum += numbers[i];
            } else {
                oddIndexSum += numbers[i];
            }
        }
        System.out.println("Sum of Elements at Even Numbers Index Positions : "
                + evenIndexSum);
        System.out.println("Sum of Elements at Odd Numbers Index Positions : "
                + oddIndexSum);
        System.out.println();
    }
}
