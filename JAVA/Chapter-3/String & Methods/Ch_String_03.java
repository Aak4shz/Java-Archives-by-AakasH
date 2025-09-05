// Escape Sequences in Strings
public class Ch_String_03 {
    public static void main(String[] args) {
        /* Escape Sequences in Strings
         1. \n - new line
         2. \t - tab
         3. \r - carriage return
         4. \f - form feed
         5. \b - backspace
         6. \" - double quote
         7. \' - single quote
         8. \\ - backslash  */

        String s1 = "Hello \nWorld";
        String s2 = "Hello \tWorld";
        String s3 = "Hello \rWorld";
        String s4 = "Hello \fWorld";
        String s5 = "Hello \bWorld";
        String s6 = "Hello \"World\"";
        String s7 = "Hello \'World\'";
        String s8 = "Hello \\World";

        System.out.println(s1);
        System.out.println("----------------------");
        System.out.println(s2);
        System.out.println("----------------------");
        System.out.println(s3);
        System.out.println("----------------------");
        System.out.println(s4);
        System.out.println("----------------------");
        System.out.println(s5);
        System.out.println("----------------------");
        System.out.println(s6);
        System.out.println("----------------------");
        System.out.println(s7);
        System.out.println("----------------------");
        System.out.println(s8);
        System.out.println("----------------------");
    }
}
