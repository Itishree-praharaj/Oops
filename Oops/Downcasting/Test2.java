interface I1 {
    void m1();
}

class C {
    void m2() {
        System.out.println("M2() defined for class C");
    }
}

class D extends C implements I1 {
    @Override
    public void m1() {
        System.out.println("M1() implemented for class D");
    }
}

public class Test2 {
    public static void main(String[] args) {
        C d1 = new D();
        System.out.println(d1.getClass());
    }
}
