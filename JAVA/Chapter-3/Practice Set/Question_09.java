// WAP to replace a string word with another string word.

public class Question_09 {
    public static void main(String[] args) {
        String word = "I am learning English";
        String replace = word.replace("English", "Coding");
        System.out.println(replace);

        // Another Examples :-

        String line = "Why don’t graveyards ever get overcrowded? " +
                "\nBecause people are dying to get in.";

        String replace1 = line.replace("graveyards", "Hospitals");
        System.out.println(replace1);

    }
}
