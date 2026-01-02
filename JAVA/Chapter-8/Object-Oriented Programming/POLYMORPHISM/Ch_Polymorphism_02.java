/* 
* Runtime Polymorphism (Method Overriding)

* Same method name in parent and child class - child provides its own implementation.

*/

// Parent Class
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child Class 1
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks: Woof! Woof!");
    }
}

// Child Class 2
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows: Meow! Meow!");
    }
}

// Child Class 3
class Cow extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cow moos: Moo! Moo!");
    }
}

public class Ch_Polymorphism_02  {
    public static void main(String[] args) {

        // Parent reference, Child objects (POLYMORPHISM!)
        Animal myAnimal;

        myAnimal = new Dog();
        myAnimal.makeSound(); // Dog barks

        myAnimal = new Cat();
        myAnimal.makeSound(); // Cat meows

        myAnimal = new Cow();
        myAnimal.makeSound(); // Cow moos

        System.out.println("\n--- Using Array ---");

        // Array of Animals
        Animal[] animals = { new Dog(), new Cat(), new Cow() };

        for (Animal a : animals) {
            a.makeSound(); // Each animal makes its own sound!
        }
    }
}

