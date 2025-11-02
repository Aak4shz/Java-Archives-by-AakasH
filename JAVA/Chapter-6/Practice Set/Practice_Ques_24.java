/* 
   Question 24 : Sum and Average of Array Elements
   Concept:Calculate the total sum of all array elements and then find their average.
   Hint: Use a sum variable, then divide by array length to get average.
 */
public class Practice_Ques_24 {
    public static void main(String[] args) {
        int [] numbers = { 37, 58, 25, 36, 93, 47, 35, 89, 42, 12, 67, 58, 69, 36, 69 };
        int sum = 0;
        System.out.println("Array Elements : ");
        for ( int num : numbers ){
            System.out.print(num + " ");
        }

        // Calculate sum 
        for ( int num : numbers ){
            sum += num;
        }
        // Calculate Average 
        double average = sum / (double) numbers.length;
        System.out.println("\n\nSum of Array Elements : " + sum);
        System.out.println("Count of Array Elements : " + numbers.length);
        System.out.println("Average of Array Elements : " + average);
    }
    
}
