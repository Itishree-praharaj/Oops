interface i1 {
    void m1();

    void m2();
}

interface i2 extends i1 {
    void m1();

}

class B implements i2 {
    public void m1() {
        System.out.println("M1() defined");
    }

    @Override
    public void m2() {
        System.out.println("m2() defined");
    }
}

class C extends B {
    void m3() {
        System.out.println("m3() defined");
    }
}

public class Test3 {
    public static void main(String[] args) {
        i2 i = new B();
        i.m1();
        i.m2();
        i2 c = new C();
        c.m1();
        c.m2();
        // c.m3();
    }
}
