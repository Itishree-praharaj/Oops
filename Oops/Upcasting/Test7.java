class K{
static void m1(){
    System.out.println("Hi");
}
}
class L extends K{
    static void m1(){
        System.out.println("Hello");
    }
}
public class Test7 {
    public static void main(String[] args) {
        K k1=new K();
        k1.m1();//through upcasting we cannot access specific static method we can only access overriding method
    }
}
