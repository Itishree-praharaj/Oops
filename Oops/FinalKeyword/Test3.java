class B {
    final int i;
    private static int num;

    B() {
        i = num++;
        System.out.println("Hi");
    }
}

public class Test3 {
    public static void main(String[] args) {
        B b1 = new B();
        System.out.println(b1.i);
        B b2 = new B();
        System.out.println(b2.i);
        B b3 = new B();
        System.out.println(b3.i);
    }
}
