
class B {
    void m1(){
        System.out.println(this);
    }
}
class Test2{
    public static void main(String[] args) {
        B b = new B();
        b.m1();
    }
}