// Write a Java program to create a class Animal with a method makeSound(). 
// Create a subclass Cat that overrides makeSound() to print "Meow".
class Animal{
    public void makeSound(){
        System.out.println("Animal make some noise.");
    }
}
class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Cat Meows : Meows ! Meows !");
    }
}
class QuestionNo_1{
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.makeSound();
        System.out.println();

        Cat cat = new Cat();
        cat.makeSound();
        System.out.println();
    }

}