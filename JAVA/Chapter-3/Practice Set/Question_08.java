// Write a program to reverse a string using StringBuilder and back to n
public class Question_08 {
    public static void main(String[] args) {
        String name = "AakasH Munda";
        String reverse = new StringBuilder(name).reverse().toString();
        System.out.println("The Original String : " + name);
        System.out.println("The Reverse String : " + reverse);
        System.out.println("-----------------------------");

        // Another example

        String word = "Do you Bleed ? Now You will !";
        String reverse1 = new StringBuilder(word).reverse().toString();
        System.out.println("The Real word : " + word);
        System.out.println("The Reverse word : " + reverse1);
        System.out.println("------------------------------");

        // Back to Normal (Reverse to Reverse)

        String Line = "Do you Bleed ? Now You will !";
        String reverse2 = new StringBuilder(Line).reverse().toString();
        System.out.println("The Reverse word  : " + reverse2);

        String Original  = new StringBuilder(reverse2).reverse().toString();
        System.out.println("Back to Original : " + Original);

    }
}
