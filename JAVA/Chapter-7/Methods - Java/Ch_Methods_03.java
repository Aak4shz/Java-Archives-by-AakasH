// Methods Overloading - Different number of parameters and different data types.

public class Ch_Methods_03 {
      static void foo() {
        System.out.println(" No parameters .");
    }

    static void foo(int a) {
        System.out.println(" One Parameter : " + a);
    }

    static void foo(int a, int b) {
        System.out.println(" Two Parameters : " + a + " and " + b);
    }

    static void foo(int a, int b, int c) {
        System.out.println(" Three Parameters : " + a + " and " + b + " and " + c + ".");
    }

    public static void main(String[] args) {

        // calling the overloading methods
        foo();
        foo(100);
        foo(100, 500);
        foo(100, 500, 900);
    }
}  
