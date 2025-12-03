// * Method Overriding Inheritance in Java.
// * Use - @Override annotation in child class.

class Animal {
    public void sound() {
        System.out.println("Animal make some Sound.");
    }
}

class Dog extends Animal {
    @Override // Indicates this method overrides the method in parent class
    public void sound() {
        System.out.println("Dog Barks : Woof ! Woof !");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat Meows : Meow ! Meow !");
    }
}

public class Inheritance_8 {
    public static void main(String[] args) {
        Animal ani = new Animal();
        ani.sound();
        System.out.println();

        Dog dog = new Dog();
        dog.sound();
        System.out.println();

        Cat cat = new Cat();
        cat.sound();
        System.out.println();
    }

}
/*
 * Rules
 * 1. Method name must be identical to the parent's methods.
 * 2. Parameters must be the same (same types and numbers).
 * 3. Return type must be the same or a compatible type.
 * 4. Access modifiers must be the same or more accessible.
 * 5. Should use @Override annotation to make intent clear.
 */