// Question 15 : Merge Two Arrays
// Concept: Combine two integer arrays into a single new array and print it.
public class Practice_Ques_15 {
    public static void main(String[] args) {
        int[] array1 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int[] array2 = { 11, 21, 31, 41, 51, 61, 71, 81, 91, 101 };

        // Print Both Arrays
        System.out.println("Array1 : ");
        for (int num : array1) {
            System.out.print(num + " ");
        }

        System.out.println("\nArray2 : ");
        for (int num : array2) {
            System.out.print(num + " ");
        }

        // New Array to hold merged elements of Array1 and Array2
        int[] mergedArray = new int[array1.length + array2.length];
        // Copying elements of Array to Merged Array
        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }
        for (int j = 0; j < array2.length; j++) {
            mergedArray[array1.length + j] = array2[j];
        }
        // Print Merged the Arrays
        System.out.println("\n\nMerged Array : ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
        System.out.println("\nLength of Merged Array : " + mergedArray.length);
        System.out.println();

    }

}
