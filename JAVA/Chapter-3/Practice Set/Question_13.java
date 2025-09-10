// Write a program to compare two strings and check if they are anagrams or not.

import java.util.Arrays;

public class Question_13 {
    public static void main(String[] args) {
        // Declaring Strings
        String s1 = "listen";
        String s2 = "Silent";

        // Removing special characters and converting to lowercase
        s1 = s1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        s2 = s2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Converting to character array
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        // Sorting the arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Checking if the arrays are equal
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}

/*
 * Anagram :-
 * Anagrams are words or phrases formed by rearranging the letters of another
 * word or phrase,
 * using all original letters exactly once.
 * Examples:
 * listen ⇄ silent
 * evil ⇄ vile
 */