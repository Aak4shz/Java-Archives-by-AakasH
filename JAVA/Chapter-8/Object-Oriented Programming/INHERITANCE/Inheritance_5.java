// Multilevel Inheritance (A Chain of Classes)
// Parent -> Child -> Grandchild
class GrandFather {
    public void house() {
        System.out.println("A beautiful house.");
    }

    public void land() {
        System.out.println("A 30 acres of land.");
    }

}

class Father extends GrandFather {
    public void car() {
        System.out.println("A BMW M3 E36 Car.");
    }

    public void money() {
        System.out.println("Almost 134 Lakh Rupees.");
    }
}

class Son extends Father {
    public void bike() {
        System.out.println("A RE-Continental GT 650 Bike.");
    }

    public void phone() {
        System.out.println("A Samsung Galaxy S25 Ultra Phone.");
    }
}

public class Inheritance_5 {
    public static void main(String[] args) {
        System.out.println("--------GrandFather Properties--------");
        GrandFather gf = new GrandFather();
        gf.land();
        gf.house();

        System.out.println("\n--------Father Properties----------");
        Father f = new Father();
        f.car();
        f.money();
        System.out.println("===Father Inherited GrandFather Properties===");
        f.land();
        f.house();

        System.out.println("\n--------Son Properties----------");
        Son s = new Son();
        s.bike();
        s.phone();
        System.out.println("===Son Inherited Father Properties===");
        s.car();
        s.money();
        System.out.println("===Son Inherited GrandFather Properties===");
        s.land();
        s.house();
    }
}
