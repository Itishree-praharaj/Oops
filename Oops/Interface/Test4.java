interface InnerTest4 {
    void m1();

    void m2();

    default int dm() {
        pm();
        System.out.println("default method");
        return 0;
    }

    static void sm() {
        System.out.println("Static method ");
    }

    private void pm() {
        System.out.println("Private method");
    }

}

class E {
    void m3() {
        System.out.println("M3 () for class E");
    }
}

class D extends E implements InnerTest4 {
    @Override
    public void m1() {
        System.out.println("M1() defined for class D");
    }

    @Override
    public void m2() {
        System.out.println("M2() defined for class D");
    }

}

public class Test4 {
    public static void main(String[] args) {
        InnerTest4 it = new D();
        it.m1();
        it.m2();
        it.dm();
        InnerTest4.sm();
        E it2 = (E) it;
        it2.m3();
    }
}