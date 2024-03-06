class D{
    private int m1(int i){
        System.out.println(i);
        return 1;
    }
}
class E extends D{
    int m1(int i){
        System.out.println("The value of i in class E is "+i);
        return 0;
    }
}
public class Test2 {
    public static void main(String[] args) {
        E e1 = new E();
        e1.m1(10);
    }
}
