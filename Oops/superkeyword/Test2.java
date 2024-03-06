class C{
    int i;
    {
        System.out.println("Class c nonstatic member initialized");
    }
    C(){
        System.out.println("Class C no arg ctt");
    }
    C(int i){
        this.i=i;
        System.out.println("Class C int arg ctt "+i);
    }
}
class D extends C{
    int i;
    {
        System.out.println("Class D nonstatic members intialized");
    }
    D(){
        super(10);
        System.out.println("Class D no arg ctt");
    }
    D(int i){
        System.out.println("Class D int arg ctt");
    }
}
public class Test2 {
    public static void main(String[] args) {
        D d1 = new D();
    }
}
