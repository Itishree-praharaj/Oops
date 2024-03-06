class E{
    int j=5;
}
class C extends E {
    static int j = 10;
}

class D extends C {
    int j = 20;

    void display() {
        System.out.println("D class i " + j);
        System.out.println("C class i " + super.j);
    }

}

class Test2 {
    public static void main(String[] args) {
        D d1 = new D();
        d1.display();
    }
}
