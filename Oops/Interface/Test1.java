interface I1 {
    void m1();

    int I = 20;
}

class A implements I1 {
    @Override
    public void m1() {
        System.out.println("Hi from class A m1 method");
    }
}

public class Test1 {
    public static void main(String[] args) {
        I1 i=new A();
        i.m1();
        System.out.println(I1.I);
    }
}
