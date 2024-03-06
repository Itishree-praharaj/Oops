interface I3 {
    void m1();
    int I = 10;
}

class F implements I3 {
    @Override
    public void m1() {
        System.out.println("m1() defined");
    }
}

public class Test5 {
    public static void main(String[] args) {
        I3 f = new F();
        f.m1();
    }
}
