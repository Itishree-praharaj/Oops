class B {
    private int a = 1;
    private static int b = 2;

    public void SetA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public static int getB() {
        return b;
    }

    public static void setB(int b) {
        B.b = b;
    }

    B(int a, int b) {
        this.a = a;
        B.b = b;
    }
}

public class Test1 {
    public static void main(String[] args) {
        B b1 = new B(10, 20);
        b1.SetA(15);
        System.out.println(b1.getA());
        System.out.println(B.getB());
    }
}
