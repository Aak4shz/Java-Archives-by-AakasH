// Nested  if Statements in Java...
public class Ch_Conditionals_07 {
    public static void main(String[] args) {
        int age = 30;
        boolean hasDriverLicense = true;

        if (age >= 20) {
            System.out.println("You are eligible to Drive.");

            if (hasDriverLicense) {
                System.out.println("You have became a pro Driver.");
            }
        }

    }

}
