/* Write a java program the following phase.
String s = "123";
Convert to int, add 7, print 130.
Convert an int back to String and print length.*/

public class Prac_Qna_06 {
    public static void main(String[] args) {
        String zx = "123";

        int num = Integer.parseInt(zx);
        num = num + 7;

        System.out.println("After Adding 7 : " + num);

        String newStr = Integer.toString(num);
        System.out.println("Length of \"" + newStr + "\" is " + newStr.length());
    }
}
// Output :
//After Adding 7 : 130
//Length of "130" is 3