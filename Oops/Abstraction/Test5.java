interface Shape {
    void draw();
}

class Rectange implements Shape {
    int length;
    int breadth;

    Rectange(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle Drawn");
    }

    public int area() {
        return length * breadth;
    }
}

class Square implements Shape {
    int length;

    Square(int length) {
        this.length = length;
    }

    @Override
    public void draw() {
        System.out.println("Square drawn");
    }

    public int area() {
        return length * length;
    }
}

class Canvas {
    static void createShape(Shape s) {
        s.draw();
    }

    static void displayArea(Shape s) {
        if (s instanceof Rectange) {
            System.out.println(((Rectange) s).area());
        } else {
            System.out.println(((Square) s).area());
        }
    }
}

class Test5 {
    public static void main(String[] args) {
        Canvas.createShape(new Rectange(10, 20));
        Canvas.displayArea(new Square(10));
    }
}