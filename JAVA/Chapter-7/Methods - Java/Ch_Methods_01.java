// Another Method is defined in class using Method.
// Using the 'obj' object to call the 'logic' instance method and demonstrate conditional logic.

public class Ch_Methods_01 {
     int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 25;
        int c;
        Ch_Methods_01 obj = new Ch_Methods_01();
        c = obj.logic(a, b);
        System.out.println(c);

        int a1 = 54;
        int b1 = 45;
        int c1;
        c1 = obj.logic(a1, b1);
        System.out.println(c1);
    }
}

