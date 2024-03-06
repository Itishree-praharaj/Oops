abstract class Shape {
    public final double PI = 3.14;
    String color;

    abstract void displayArea();

    abstract void calcArea();

    Shape(String color) {
        this.color = color;
    }
}

class Circle extends Shape {
    double radius;
    double area;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    void displayArea() {
        System.out.println("*******CIRCLE*******");
        System.out.println("Area = " + area);
    }

    @Override
    void calcArea() {
        area = PI * radius * radius;
    }
}

class Rectangle extends Shape {
    int length;
    int breadth;
    double area;

    Rectangle(String color, int length, int breadth) {
        super(color);
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void calcArea() {
        area = length * breadth;
    }

    @Override
    void displayArea() {
        System.out.println("*******RECTANGLE*******");
        System.out.println("length = " + length);
        System.out.println("breadth = " + breadth);
        System.out.println("Area = " + area);
    }
}

public class Test3 {
    public static void main(String[] args) {
        Shape c = new Circle("blue", 4);
        c.displayArea();
        c.calcArea();
        c.displayArea();
        c = new Rectangle("Red", 40, 35);
        c.calcArea();
        c.displayArea();
    }
}
