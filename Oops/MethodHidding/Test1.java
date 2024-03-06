class A {
    static void m1() {
        System.out.println("hi from class A");
    }
}

class B extends A {
    static void m1() {
        System.out.println("Hi from class B");
    }
}

public class Test1 {
    public static void main(String[] args) {
        B b1 = new B();
        b1.m1();
    }
}