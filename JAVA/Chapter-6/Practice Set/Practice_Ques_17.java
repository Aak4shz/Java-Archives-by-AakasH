// Remove Duplicate Elements
//  Concept: Create a new array containing only unique elements.
public class Practice_Ques_17 {
    public static void main(String[] args) {
        int[] numbers = { 37, 58, 25, 36, 93, 47, 35, 89, 42, 12, 67, 58, 69, 36, 69 };

        System.out.println("Original Array : ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        // Remove Duplicates

        int[] unique = removeDuplicates(numbers);

        System.out.println("\n\nArray After Removing Duplicates :  ");
        for (int num : unique) {
            System.out.print(num + " ");
        }
    }

    // Method to remove duplicates without using collections
    public static int[] removeDuplicates(int[] arr) {
        int num = arr.length;
        int[] temp = new int[num];
        int uniqueCount = 0;

        for (int i = 0; i < num; i++) {
            boolean isDuplicate = false;

            // Check if arr[i] is already existing in temp array
            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            // If not duplicate, Add to temp array

            if (!isDuplicate) {
                temp[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }
        // Create result array of size uniqueCount elements
        int[] result = new int[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }
        return result;
    }

}
