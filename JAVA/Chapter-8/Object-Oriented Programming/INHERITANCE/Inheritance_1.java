
class Base {
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in Base and setting x now");
        this.x = x;
    }

    public void printMessage() {
        System.out.println("I am a method in the Base class!");
    }
}

class Derived extends Base {
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Inheritance_1 {
    public static void main(String[] args) {

        // Base class Object creation and same GetX or SetX
        Base b = new Base();
        b.setX(10);
        System.out.println("Base Object : " + b.getX());

        // Derived class Object creation and same GetY or SetY
        Derived d = new Derived();
        d.setY(20);
        System.out.println("Derived Object : " + d.getY());

        // Derived class Object creation and Base class GetX or SetX
        Derived b2 = new Derived();
        b2.setX(100);
        System.out.println("Class Base But Object Derived class : " + b2.getX());

        b.printMessage();

        // But You can't Access getY and setY using Base class Object
    }
}
