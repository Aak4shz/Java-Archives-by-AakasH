// Create a Calculator class with method : add(), sub(), mul(), & div().

class Calculator{
    public void add(int a , int b){
        System.out.println(a + b);
    }
    public void sub(int a , int b){
        System.out.println(a - b);
    }
    public void multiply(int a , int b){
        System.out.println(a * b);
    }
    public void divide(int a , int b){
        System.out.println(a / b);
    }
}

public class Prac_Ques_06 {
    public static void main(String[] args) {
        
        Calculator obj = new Calculator();
        obj.add(25, 75);
        obj.sub(100, 25);
        obj.multiply(25, 25);
        obj.divide(75, 5);
        System.out.println();
        
    }
}
