class F{
    void m1(){
        System.out.println("Hi from F class m1  method");
    }
}
class G extends F{
    void m1(){
        System.out.println("Hi from G class m1 method");
    }
}
class Test4{
    public static void main(String[] args) {
        F f1 = new G();
        f1.m1();
    }
}