// Write a Java program to convert the first letter of each word in a string to uppercase.
public class Question_10 {
    public static void main(String[] args) {
        String word = "you know what is this .";
        String[] words = word.split(" ");
        String result = "";

        for (String w : words) {
            result += w.substring(0, 1).toUpperCase() + w.substring(1) + " ";

        }
        System.out.println("Before : " + word);
        System.out.println("After : " + result.trim());

    }
}

/* Output :-
 Before : you know what is this .
 After : You Know What Is This .
 */
