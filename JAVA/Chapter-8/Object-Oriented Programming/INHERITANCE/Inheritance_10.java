// * The Super Keyword (Accessing Parent Class Methods)
// * 2. Calling parent Methods...

class Animal {
    void sound() {
        System.out.println("Animal make some sound.");
    }
}

class Dog extends Animal {
    @Override
    void sound() { // method is already overridden in parent class
        super.sound(); // calls parent class method
        System.out.println("Dogs Barks : Woof! Woof!");
    }
}

public class Inheritance_10 {
    public static void main(String[] args) {
        Animal ani = new Animal();
        ani.sound();
        System.out.println();

        Dog dog = new Dog();
        dog.sound();
        System.out.println();
    }
}
