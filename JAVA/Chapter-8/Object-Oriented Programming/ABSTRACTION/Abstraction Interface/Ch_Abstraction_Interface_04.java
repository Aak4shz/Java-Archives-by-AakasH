// Multiple Interface Implementations

interface Drawable {
    void draw();
}

interface Colorable {
    void fillColor(String color);
}

class Circle implements Drawable, Colorable {

    @Override
    public void draw() {
        System.out.println("Drawing a Circle ");
    }

    @Override
    public void fillColor(String color) {
        System.out.println("Filling Circle with : " + color + " color");
    }
}

class Rectangle implements Drawable, Colorable {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle ");
    }

    @Override
    public void fillColor(String color) {
        System.out.println("Filling Rectangle with : " + color + " color ");
    }
}

public class Ch_Abstraction_Interface_04 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
        circle.fillColor("Blue");
        System.out.println();

        Rectangle rec = new Rectangle();
        rec.draw();
        rec.fillColor("White");
        System.out.println();
    }
}
