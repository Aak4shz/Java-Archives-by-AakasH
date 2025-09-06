// Checking how much Vowel letter in a String ?
public class Question_07 {
    public static void main(String[] args) {
        String name = "AakasH Munda ";
        int count = 0;
        name = name.toLowerCase();
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if ("aeiou".indexOf(ch) != -1) {
                count++;
            }
        }
        System.out.println("Number of Vowels letter is : " + count);
    }
}

// Output :- Number of Vowels letter is : 5
