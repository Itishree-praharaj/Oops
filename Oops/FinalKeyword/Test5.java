class E{
    static void m1(){
        System.out.println("m1 method in class E");
    }
}
class F extends E{
    void m2(){
        System.out.println("m2 method in class F");
    }    
}
public class Test5 {
    public static void main(String[] args) {
        F f1 = new F();
        E.m1();
    }
}
