class A{
    short m1(){
        System.out.println("Class A m1 method");
        return 1;
    }
}
class B extends A{
    @Override
    short m1(){
        System.out.println("class B m1 method");
        return 0;
    }
}
class C extends B{
    void m2(){
        System.out.println("Class c m2 method");
    }
}
public class Test1 {
    public static void main(String[] args) {
        C c1 = new C();
        c1.m2();
        c1.m1();
    }
}
