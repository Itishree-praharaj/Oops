class A{
    int i=20;
    A(int i){
        System.out.println("A class no arg ctt");
    }
}
class B extends A{
    B(int i,int j){
        super(i);
        System.out.println("class b int,int arg ctt");
    }
}
public class Test1 {
    public static void main(String[] args) {
        B b1 = new B(0, 0);
    }    
}
