class D {
    int i;
    D(int i){
        this.i=i;
    }
}
class E{
    int i;
    E(int i){
        this.i=i;
    }
    void m1(D arg){
        System.out.println(i);
        System.out.println(this.i);
        System.out.println(arg.i);
    }
}
class Test6{
    public static void main(String[] args) {
        D d1=new D(10);
        E e1=new E(20);
        e1.m1(d1);
    }
}
