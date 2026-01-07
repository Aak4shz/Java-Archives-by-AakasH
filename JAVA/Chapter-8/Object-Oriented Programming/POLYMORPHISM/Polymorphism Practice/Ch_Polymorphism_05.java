/* Question 1 : Method Overloading - Greeting
   Create a class Greeter with overloaded greet() methods:

    greet() - prints "Hello, Guest!"
    greet(String name) - prints "Hello, {name}!"
    greet(String name, String time) - prints "Good {time}, {name}!"

*/

class Greeter {
    // Method to greet a guest

    public void greet() {
        System.out.println("Hello, Sir !");
    }

    // Method to greet a person by name
    public void greet(String name) {
        System.out.println("Hello, " + name + " ! ");
    }

    // Method to greet a person time and name

    public void greet(String name, String time) {
        System.out.println("Good " + time + " ! " + name);
    }
}

public class Ch_Polymorphism_05 {
    public static void main(String[] args) {
        Greeter greet = new Greeter();

        greet.greet();
        greet.greet("Aakash");
        greet.greet("Aakash", "Morning");
        System.out.println();
    }
}
