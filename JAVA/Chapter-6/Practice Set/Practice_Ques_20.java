// Question 20 : Sum of Two Arrays (Element-wise)
// Concept: Add elements at the same index from two arrays and store in a third array.
public class Practice_Ques_20 {
    public static void main(String[] args) {

        int [] numbers = { 37, 58, 25, 36, 93, 47, 35, 89, 42, 12, 67, 58, 69, 36, 69 };
        int [] numbers2 = { 12, 45, 78, 23, 56, 89, 90, 11, 34, 67, 88, 12, 34, 90, 11 };
        int [] sum = new int [numbers.length];
        System.out.println("First Array : ");
        for ( int num : numbers ){
            System.out.print(num + " ");
        }
        System.out.println("\nSecond Array : ");
        for ( int num2 : numbers2 ){
            System.out.print(num2 + " ");
        }
        // Sum of Two Arrays 

        for ( int i = 0; i < numbers.length; i++ ){
            sum[i] = numbers[i] + numbers2[i];
        }
        System.out.println("\n\nSum of two Arrays (Element-Wise) : ");
        for ( int s : sum ){
            System.out.print(s + " ");
        }
        System.out.println("\n");
    }
}
