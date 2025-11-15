/* 
  * Create a program with overloaded method display():
  * display(String name) → prints name
  * display(String name, int age) → prints name and age
  
 */
public class Question_15 {
    static void display(String name) {
        System.out.println("Name : " + name);

    }

    // Overload Method
    static void display(String name, int age) {
        System.out.println("Name : " + name + " , Age : " + age);
    }

    public static void main(String[] args) {
        display("Aakash");
        display("Sachin ChutMarike", 23);
    }

}
