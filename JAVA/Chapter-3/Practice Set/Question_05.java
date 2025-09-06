// Create a String Object and Trimming first space or last space.
public class Question_05 {
    public static void main(String[] args) {
        String name = " Aakash Munda ";
        System.out.println(name.length());
        System.out.println("Before Trimming : " + name);

        String trimmed = name.trim();
        System.out.println(trimmed.length());
        System.out.println("After Trimming : " + trimmed);

    }
}
