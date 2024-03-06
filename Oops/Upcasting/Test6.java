class H {
    void m1() {
        System.out.println("Hi from class H m1 method");
    }
}

class I extends H {
    void m2() {
        System.out.println("Hi from class I m1 method");
    }
}

class J extends I {
    void m3() {
        System.out.println("Hi from class J m1 method");
    }
}

public class Test6 {
    public static void main(String[] args) {
        H h1 = new I();
        h1.m1();
        System.out.println("-------------");
        I i1 = new J();
        i1.m1();
    }
}