// Write a Simple Java Program in Inheritance Concept between Mom(Parent) and Daughter(Child).

class Mom {
    String hairColour = "Black";
    String eyeColour = "Brown";

    void cook() {
        System.out.println("Mom is Cooking Dishes");
    }

    void work() {
        System.out.println("Mom is Working.");
    }
}

class Daughter extends Mom {
    String hobby = "Dancing";
    int age = 18;

    void study() {
        System.out.println("Daughter is Studying .");
    }
}

public class Inheritance_4 {

    public static void main(String[] args) {
        // Mom Own Properties
        Mom Kalpana = new Mom();
        Kalpana.work();
        Kalpana.cook();
        System.out.println("Mom's Hair Colour : " + Kalpana.hairColour);
        System.out.println("Mom's Eye  Colour : " + Kalpana.eyeColour);

        // Daughter Own Properties
        System.out.println("--------Daughter Own Properties--------");
        Daughter Reena = new Daughter();
        Reena.study();
        System.out.println("Daughter's Hobby : " + Reena.hobby);
        System.out.println("Daughter's Age : " + Reena.age);

        // Daughter Inherited Mom's Properties
        System.out.println("--------Daughter Inherited Mom's Properties--------");
        System.out.println("Daughter's Hair Colour : " + Reena.hairColour);
        System.out.println("Daughter's Eye Colour : " + Reena.eyeColour);

        System.out.println("Reena's Mom Actions are:");
        Reena.cook();
        Reena.work();
    }

}