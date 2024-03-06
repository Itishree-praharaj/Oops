class C{
    C(){

    }
    void m1(){
        System.out.println("C class m1 mthd");
    }
}
class D extends C{
    D(){

    }
    void m2(){
        System.out.println("D class m2 mthd");
    }
}
public class Test4 {
    public static void main(String[] args) {
        C c1 = new D();
        c1.m2();
    }
}
