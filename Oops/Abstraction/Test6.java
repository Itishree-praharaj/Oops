abstract class A {
    public abstract void m2();

    public int m1() {
        return 1;
    }
}

class B extends A {
    @Override
    public void m2() {
        System.out.println("hi from class B ");
    }
}

public class Test6 {
    public static void main(String[] args) {
        B a1 = new B();
        a1.m2();
        System.out.println(a1.m1());
    }
}
