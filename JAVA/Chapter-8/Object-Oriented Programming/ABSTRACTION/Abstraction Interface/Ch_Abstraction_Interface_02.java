/* 
  * An interface is a reference type in java similar to class that is a collection of abstract methods.
  * A class implements an interface, thereby inheritance the abstract methods of the interface. 

  *===========BASIC SYNTAX OF INTERFACE IN JAVA============ */
 
// Here is an example of interface in java:
// Step 1 : Define an interface
interface Animal {
    void makeSound();

    void eat();

    void sleep();
}

// Step 2 : Implement the Interface

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog says : Woof! Woof!");
    }

    public void eat() {
        System.out.println("Dog eats Bones.");
    }

    public void sleep() {
        System.out.println("Dog sleep in the Day.");
    }
}

// Another class

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Cat says : Meow Meow !");
    }

    public void eat() {
        System.out.println("Cat eats Fishes.");
    }

    public void sleep() {
        System.out.println("Cat sleep in the night.");
    }
}

// Step 3: Main Class
public class Ch_Abstraction_Interface_02 {
    public static void main(String[] args) {

        // Create Objects
        Dog dog = new Dog();
        Cat cat = new Cat();

        // calls methods
        System.out.println("--------Dog-------");
        dog.makeSound();
        dog.eat();
        dog.sleep();
        System.out.println();

        System.out.println("--------Cat-------");
        cat.makeSound();
        cat.eat();
        cat.sleep();
        System.out.println();
    }
}
