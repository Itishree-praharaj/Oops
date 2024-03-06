class Box {
    int height;
    int width;
    int length;

    Box() {
    }

    Box(int h, int w, int l) {
        height = h;
        width = w;
        length = l;
    }

    Box(Box arg) {
        this.height = arg.height;
        this.width = arg.width;
        this.length = arg.length;
    }

    void display() {
        System.out.println("height = " + height);
        System.out.println("width = " + width);
        System.out.println("length = " + length);
    }
}

class Test8 {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(3, 5, 7);
        Box b3 = new Box(b1);
        Box b4 = new Box(b2);
        b1.display();
        b2.display();
        b3.display();
        b4.display();
    }
}
