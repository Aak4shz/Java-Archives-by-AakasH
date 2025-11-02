/*  Question 28 : Addition of Two Matrices
Concept:Add two 2D arrays (matrices) element-by-element.
Hint:Both matrices must have same dimensions. */
public class Practice_Ques_28 {
    public static void main(String[] args) {

        // two input arrays of equal length
        int[] number = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int[] numbers2 = { 11, 21, 31, 41, 51, 61, 71, 81, 91, 101 };
        
        // array to store element-wise sums
        int[] sum = new int[number.length];

        // compute sum for each index
        for (int i = 0; i < number.length; i++) {
            sum[i] = number[i] + numbers2[i];
        }

        // print first array
        System.out.print("First Array : ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }

        // print second array
        System.out.print("\nSecond Array : ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(numbers2[i] + " ");
        }

        // print result (element-wise sum)
        System.out.println("\n\nSum of Two Array in Element-Wise : ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(sum[i] + " ");
        }
        System.out.println("\n");

    }
}
