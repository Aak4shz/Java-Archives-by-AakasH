// Write a java program to replace spaces with underscores.
public class Question_02 {
    public static void main(String[] args) {
        String name = " Aakash Munda ";
        System.out.println(name);

        String replacedString = name.replace(" " , "_");
        System.out.println(replacedString);

        String trimmedString = name.trim();
        System.out.println(trimmedString);
        
        String replacedTrimmedString = trimmedString.replace(" " , "_");
        System.out.println(replacedTrimmedString);

    }
}
