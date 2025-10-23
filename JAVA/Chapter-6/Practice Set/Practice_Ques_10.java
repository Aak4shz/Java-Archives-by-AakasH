// Question 10 : Take an arrays of integers and find how many elements are positive, negative, and zero. Concept: Conditional counting (if-else).
public class Practice_Ques_10 {
    public static void main(String[] args) {

        int[] numbers = { -10, 0, +5, -38, 23, +18, 0, 17, 0, -9, 89 };
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int num : numbers) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }

        }
        System.out.println("Array Elements : " + numbers.length);
        System.out.println("Total Zeroes : " + zeroCount);
        System.out.println("Total Positive Numbers : " + positiveCount);
        System.out.println("Total Negative Numbers : " + negativeCount);
        System.out.println();

    }
}
