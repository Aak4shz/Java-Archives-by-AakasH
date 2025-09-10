// Sort the characters of a String and create a new String.

import java.util.Arrays;

public class Question_15 {
    public static void main(String[] args) {
        String line = "characters";

        char[] arr = line.toCharArray();
        Arrays.sort(arr);

        String sorted = new String(arr);
        System.out.println("Original String : " + line);
        System.out.println("Sorted String : " + sorted);

    }
}
