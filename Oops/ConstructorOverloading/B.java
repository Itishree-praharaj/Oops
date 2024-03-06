class B {
    int i;
    B(int i){
        this.i=i;
    }
}
class C{
    void m1(B arg){
        System.out.println(arg.i);
    }
}
class Test5{
    public static void main(String[] args) {
       B b1=new B(10);
       B b2 =new B(20); 
       C c1=new C();
       c1.m1(b1);
       c1.m1(b2);
    }
}
