// Hierarchical Inheritance (One Parent Class and Multiple Child Classes)
// ParentClass -> ChildClass1 -> ChildClass2..

class Animal {
    public void legs(){
        System.out.println(" It has 4 legs.");
    }
    public void eat(){
        System.out.println(" He is Eating Food.");
    }
    public void makeNoise(){
        System.out.println(" He is making some noise.");
    }
}
class Dog extends Animal{
    public void food(){
        System.out.println("Dog is eating Meat and Bones.");
    }
    public void sleep(){
        System.out.println("Dog is sleeping peacefully.");
    }
}
class Cat extends Animal{
    public void eating(){
        System.out.println("Cat is eating fish and milk.");
    }
    public void chase(){
        System.out.println("Cat is chasing mice.");
    }
}
public class Inheritance_6 {
    public static void main(String[] args) {
        System.out.println("-------Animal Properties-------");
        Animal a = new Animal();
        a.legs();
        a.eat();
        a.makeNoise();

        System.out.println("\n-------Dog Properties-------");
        Dog d = new Dog();
        d.food();
        d.sleep();
        System.out.println("\n===Dog Inherited Animal properties===");
        d.legs();
        d.eat();
        d.makeNoise();

        System.out.println("\n-------Cat Properties-------");
        Cat c = new Cat();
        c.eating();
        c.chase();
        System.out.println("\n===Cat Inherited Animal properties===");
        c.legs();
        c.eat();
        c.makeNoise();

    }
}
