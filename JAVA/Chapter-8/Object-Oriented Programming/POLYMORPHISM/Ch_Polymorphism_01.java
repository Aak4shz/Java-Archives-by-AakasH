/* Definition
* Polymorphism = "Poly" (many) + "Morph" (forms)

* The ability of an object to take on multiple forms, 
* allowing the same method or object to behave differently based on the context. 

* Polymorphism
      ├── Compile-time (Static) → Method Overloading
      └── Runtime (Dynamic) → Method Overriding

*/

// Here is Compile-Time Polymorphism Example (Method Overloading)
class Calculator {

    // Method with 2 int parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with 3 int parameters (OVERLOADED)
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with double parameters (OVERLOADED)
    double add(double a, double b) {
        return a + b;
    }
}

public class Ch_Polymorphism_01 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Add 2 numbers: " + calc.add(10, 20)); // 30
        System.out.println("Add 3 numbers: " + calc.add(10, 20, 30)); // 60
        System.out.println("Add doubles: " + calc.add(10.5, 20.5)); // 31.0
    }
}
