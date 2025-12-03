// Hybrid Inheritance (Mix of Single and Hierarchical Inheritance)

// Base Class
class A {
    void showA() {
        System.out.println("Main Maa Hun | - (Class - A).");
    }
}

// B inherited from A
class B extends A {
    void showB() {
        System.out.println("Main Beti Hun A ki | - (Class - B).");
    }
}

// C also inherited from A
class C extends A {
    void showC() {
        System.out.println("Main Beta Hun A ka | - (Class - C).");
    }
}

// D inherited from B only

class D extends B {
    void showD() {
        System.out.println("Main Beta hun | - (Class - D).");
    }
}

public class Inheritance_7 {
    public static void main(String[] args) {
        System.out.println("---------------- A ----------------\n");
        A a = new A();
        System.out.println("Main Hun A : ");
        a.showA();
        System.out.println("Mere Do Bacche hai.");
        System.out.println("-------------------------------\n\n");

        System.out.println("---------------- B ----------------\n");
        B b = new B();
        System.out.println("B main hun");
        b.showB();
        System.out.println("A meri maa hai.");
       // b.showC(); ye galat hai
        System.out.println("-------------------------------\n\n");

        System.out.println("---------------- C ----------------\n");
        C c = new C();
        System.out.println("C main hun");
        c.showC();
        System.out.println("A meri maa hai.");
      //  c.showB(); ye galat hai
        System.out.println("-------------------------------\n\n");

        System.out.println("---------------- D ----------------\n");
        D d = new D();
        System.out.println("D main hun.");
        d.showD();
        System.out.println("B meri maa hai.");
        System.out.println("A meri nani (maa ki maa) hai.");
        // d.showC();Ye Galat hai
    }
}
