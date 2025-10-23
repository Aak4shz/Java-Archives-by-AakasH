// Question 4. Write a program to find the maximum and minimum element in an array.
public class Practice_Ques_04 {
    public static void main(String[] args) {
        int[] numbers = { 45, 75, 22, 87, 82, 80, 99, 63, 71, 90 };
        int max = numbers[0];
        int min = numbers[0];

        /*
         * Find Maximum
         * for (int i = 1; i < numbers.length; i++) {
         * if (numbers[i] > max) {
         * max = numbers[i];
         * }
         * }
         */


        // A single loop for maximum and minimum elements..
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max)
                max = numbers[i];
            if (numbers[i] < min)
                min = numbers[i];
        }

        /*
         * Find Minimum
         * for (int i = 1; i < numbers.length; i++) {
         * if (numbers[i] < min) {
         * min = numbers[i];
         * }
         * }
         */
        
        System.out.println("Maximum Number is : " + max);
        System.out.println("Minimum Number is : " + min);
    }
}

/*
 * 
 */