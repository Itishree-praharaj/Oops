
class A {
    void m1() {
        System.out.println("m1() defined for class A");
    }
}

class B extends A {
    @Override
    void m1() {
        System.out.println("m1() defined for class B");
    }

    void m2() {
        System.out.println("m2() defined for class B");
    }
}

public class Test1 {
    public static void main(String[] args) {
        A a1 = new B();
        a1.m1();
        B b1 = (B) a1;
        ((B) a1).m2(); // Downcasting
        b1.m2(); // Downcasting
    }
}
