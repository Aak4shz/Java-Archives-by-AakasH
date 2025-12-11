// Abstraction - Abstract Class


abstract class Animal {
    // properties
    String name;
    int age;
    String animalType;

    abstract void sound();

    abstract void animalType();

    // parameterized Constructor
    Animal(String name, int age, String animalType) {
        this.name = name;
        this.age = age;
        this.animalType = animalType;
    }

    // methods
    void sleep() {
        System.out.println(name + " is Sleeping.");
    }

    void eat() {
        System.out.println(name + " is Eating.");
    }

    void running() {
        System.out.println(name + " is Running.");
    }

    public void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Type : " + animalType);
    }
}


// inheritance class
class Dog extends Animal {
    Dog(String name, int age, String animalType) {
        super(name, age, animalType);
    }

    @Override
    void sound() {
        System.out.println(name + " is Barking : Woof! Woof!");
    }

    @Override
    void animalType() {
        System.out.println(name + " is a " + animalType + " animal.");
    }
}

class Lion extends Animal {
    Lion(String name, int age, String animalType) {
        super(name, age, animalType);
    }

    @Override
    void sound() {
        System.out.println(name + " roars : Rrrrr! Rrrrr!");
    }

    @Override
    void animalType() {
        System.out.println(name + " is a " + animalType + " animal.");
    }
}

public class Abstraction_2 {
    public static void main(String[] args) {
        Animal dog = new Dog("Max", 6, "Pet");
        Animal lion = new Lion("Simba", 16, "Wild");
        System.out.println("------Dog Properties-------");
        dog.displayInfo();
        dog.sound();
        dog.eat();
        dog.running();
        dog.sleep();
        dog.animalType();

        System.out.println("\n--------Lion Properties-------");
        lion.displayInfo();
        lion.sound();
        lion.eat();
        lion.running();
        lion.sleep();
        lion.animalType();
    }
}
