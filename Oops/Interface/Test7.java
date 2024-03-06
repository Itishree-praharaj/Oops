
interface I4 {
    default void m1() {
        System.out.println("Hi from interface I4");
    }

}

interface I5 {
    default void m1() {
        System.out.println("Hi from interface I5");
    }
}

class Demo implements I4, I5 {
    @Override
    public void m1() {
        I4.super.m1();
        I5.super.m1();
    }
}

public class Test7 {
    public static void main(String[] args) {
        Demo demo1 = new Demo();
        demo1.m1();
    }
}
