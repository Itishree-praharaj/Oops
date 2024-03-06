class A {
    int i;

    A(int i) {
        this.i = i;
    }
    
    @Override
    public boolean equals(Object obj) {
        return this.i == ((A) obj).i;
    }
}

public class Test1 {
    public static void main(String[] args) {
        A a1 = new A(10);
        A a2 = new A(10);
        System.out.println(a1.equals(a2));
    }
}
