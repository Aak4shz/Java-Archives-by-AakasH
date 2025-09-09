// Print a unique character in String
public class Question_11 {
    public static void main(String[] args) {
        String word = "you are a bad boy !";
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }
        System.out.println("Unique Character is : " + result);

    }
}
/* Output :-
 * Unique Character is : you arebd!
 */