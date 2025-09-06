// Palindrome word : Check Program using if else condition.
public class Question_06 {
    public static void main(String[] args) {
        String name = "malayalam"; // Palindrome word : malayalam
        String reverse = new StringBuilder(name).reverse().toString();
        if (name.equals(reverse)){
            System.out.println(name + " is a Palindrome Word .");
        }
        else {
            System.out.println(name + " is Not a Palindrome Word .");
        }

    }
}
 
/* Palindrome word = A palindrome is a word, number, 
 * phrase, or phrase that reads the same forward and backward.
 * Examples:
 * Word: madam, level, racecar
 * Number: 121, 12321
 */