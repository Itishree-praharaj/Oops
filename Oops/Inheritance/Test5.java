class A {
    int i=10;
    A m1() {
        System.out.println("Hi");
        return new A();
    }
}

class B extends A {
    int i=12;
    @Override
    B m1() {
        System.out.println(super.i);
        System.out.println("Hiii");
        return new B();
    }
}

class C extends B {
    @Override
    B m1() {
        System.out.println(super.i);
        System.out.println("Hello");
        return new C();
    }
}

public class Test5 {
    public static void main(String[] args) {
        A a1 = new C();
        a1.m1();
    }
}
