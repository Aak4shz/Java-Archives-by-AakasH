// Write a Program to find a out wether a given integer number is present in an arrays or not.
public class Ch_Array_5 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 6, 8, 10, 15 };
        int num = 10;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(num + " is present in the array.");
        } else {
            System.out.println(num + " is not present in the array.");
        }
    }

}
