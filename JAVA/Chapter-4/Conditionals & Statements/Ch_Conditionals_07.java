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

/* Nested if Statement ->
 * The Nested if Statement means writing one if statement inside another if statement.
 * This is used when you need to check multiple conditions,
 * and you have to make decisions one after another based on those conditions.
 */
