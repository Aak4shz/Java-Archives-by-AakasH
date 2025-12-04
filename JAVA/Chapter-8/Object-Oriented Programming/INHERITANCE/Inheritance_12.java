/* A Program where use all types programs of super keyword using inheritance 
 * The super keyword (Accessing parent class methods)
 * calling parent constructor
 * Parent Variable Access in Child class
  */

// Base class
class Parent {
    int value = 1000;
    String name = "Aakash Munda";

    // Parent Constructor
    Parent(String name) {
        this.name = name;
        System.out.println("Parent Constructor : " + name);
    }

    // Parent Method
    void showInfo() {
        System.out.println("Parent show info : \nName : " + name + "\nValue : " + value);
    }
}

// Child class
class Child extends Parent {
    int value = 2000;
    String name = "ChutMarike";

    // Child Constructor
    Child(String name) {
        super(name);
        System.out.println("Child Constructor : " + name);
    }

    @Override
    void showInfo() {
        super.showInfo();
        System.out.println("Child show Info : " + "\nName : " + name + "\nValue : " + value);
    }

    // Access Variable in Child Class
    void accessVariable() {
        System.out.println("Child Variable : " + this.value);
        System.out.println("Parent Variable : " + super.value);
        System.out.println("Child Variable : " + this.name);
        System.out.println("Parent Variable : " + super.name);
    }
}

public class Inheritance_12 {
    public static void main(String[] args) {
        // Constructor call
        Child obj = new Child("Aakash Munda");

        System.out.println("========Parent Constructor Call==============");
        System.out.println("========Parent Method Call================= ");
        obj.showInfo();

        System.out.println("========Parent Variable Access===============");
        obj.accessVariable();
    }
}
