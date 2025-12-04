// The Super Keyword (Accessing Parent Class Methods)
// * 1. Calling parent Constructor..

class person {
    String name;
    int age;

    person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class student extends person {
    String rollNo;

    student(String name, int age, String rollNo) {
        super(name, age); // calls parent constructor
        this.rollNo = rollNo;
    }
}

public class Inheritance_9 {
    public static void main(String[] args) {
        student s1 = new student("Aakash Munda", 20, "0011");
        System.out.println("Name : " + s1.name);
        System.out.println("Roll No :" + s1.rollNo);
        System.out.println("Age : " + s1.age);
    }
}
