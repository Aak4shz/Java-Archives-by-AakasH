// * The Super Keyword (Accessing Parent Class Methods)
// * 3. Parent Variable Access in Child Class

class Parent {
    int value = 100;

    void showParentValue(){
        System.out.println("Parent Value : " + value);
    }
}

class Child extends Parent {
    int value = 1000;

    void showBothValue(){
        System.out.println("Child Value : " + this.value);
        System.out.println("Parent Value : " + super.value);
    }

    void showMethods(){
        super.showParentValue();
    }
}
public class Inheritance_11 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.showBothValue();

        obj.showMethods();
       
    }
}
