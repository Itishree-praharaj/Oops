class E {
    void m1() {
        System.out.println("M1() defined for class E");
    }
}

class F extends E {
    void m2() {
        System.out.println("M2() defined for class F");
    }
}

class G extends F {
    void m3() {
        System.out.println("M3() defined for class G");
    }
}

public class Test3 {
    public static void main(String[] args) {
        E f = new G();
        f.m1();
        ((F) f).m2();
        ((G) f).m3();
    }
}