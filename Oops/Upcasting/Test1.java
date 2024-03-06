class A{
    A(){
        System.out.println("Hii from class A");
    }
}
class B extends A{
    B(){
        System.out.println("Hii from class B");
    }
}
public class Test1 {
    public static void main(String[] args) {
        A a1 = new B();
    }
}
