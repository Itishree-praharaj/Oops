class D {
    int i=45;
    static int j=77;
    void m1(){
        System.out.println(i);
        System.out.println(j);
    }
}
class Test4{
    public static void main(String[] args) {
        D d=new D();
        // d.m1();
        D d2 = new D();
        d2.j=20;
        d2.m1();
        d2.i=20;
        d.m1();
        d2.m1();
    }
}
