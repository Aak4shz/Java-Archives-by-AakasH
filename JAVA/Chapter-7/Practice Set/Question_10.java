/* Write a program with a non-static method displayInfo(String name, int age) that prints a message.
 * Call it using an object.
 */
public class Question_10 {
    void displayInfo(String name, int age) {
        System.out.println("Hello ! My Name is : " + name);
        System.out.println("I am " + age + " years old.");
        System.out.println("Have a nice day !");
    }

    public static void main(String[] args) {
        Question_10 obj = new Question_10();
        obj.displayInfo("Aakash", 21);
        obj.displayInfo("Sachin Chutmarike", 25);
    }

}
