class C{
    int i=10;
}
class D extends C{
    int j=20;
}
class E{
    void m1(C c1){
        System.out.println(c1.j);
    }
}
public class Test2 {
    public static void main(String[] args) {
        C d1 = new D();
        new E().m1(d1);
    }
}
