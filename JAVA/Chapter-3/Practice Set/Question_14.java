// Write a program to print the longest word in a sentence.

public class Question_14 {
    public static void main(String[] args) {
        String line = "Tell Them All. Whoever Comes, Whoever It Is, I'll Kill Them." +
                " I'll Kill Them All.\nMr. John Wick.";

        String[] words = line.split("\\W+");
        String largest = words[0];
        for (String w : words) {
            if (w.length() > largest.length()) {
                largest = w;
            }
        }
        System.out.print(line);
        System.out.println("Largest Word : " + largest + " Length : " + largest.length());

    }
}

// ("\\W+") --> \\W+ is a regular expression that matches any non-word character and space.