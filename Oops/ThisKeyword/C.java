class C {
    int i=45;
    static void m1(){
        // System.out.println(this.i);//error
    }
}
class Test3{
    public static void main(String[] args) {
        C c=new C();
        c.m1();
    }
}
