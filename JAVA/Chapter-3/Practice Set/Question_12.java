
// Write a Java program to count the duplicate characters and their frequency in a given string.

public class Question_12 {
    public static void main(String[] args) {
        String word = "Athena! You will suffer for this betrayal." +
                "\n I am no slave of fate! I am the Ghost of Sparta… and I will have my revenge!";
        word = word.toLowerCase();
        int[] freq = new int[256];
        for (int i = 0; i < word.length(); i++) {
            freq[word.charAt(i)]++;

        }
        System.out.println("Duplicate characters are : ");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 1 && Character.isLetter((char) i)) {
                System.out.println((char) i + " : " + freq[i]);
            }
        }

    }
}
