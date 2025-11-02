/* Question 21 : Linear Search
   Concept: Search a specific element in an unsorted array using a simple loop.
   Hint: Compare each element one by one until found. 
 */
public class Practice_Ques_21 {
    public static void main(String[] args) {

        int[] numbers = { 37, 58, 25, 36, 93, 47, 35, 89, 42, 12, 67, 58, 69, 36, 69 };
        int target = 89;
        boolean found = false;
        System.out.println("Array Elements : ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        // Linear Search Algorithms
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
                System.out.println("\n\nElement " + target + " found at index : " + i);
                break;
            }
        }

        if (!found) {
            System.out.println("\n\nElement " + target + " not found in the array .  ");
        }
    }
}

// Linear Search Linear Search is the simplest searching technique.
// It checks each element in the array one by one until the desired element
// (called the target) is found or the end of the array is reached.