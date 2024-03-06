class F {
    int i;
    F(int i){
        this.i=i;
    }    
    void display(F arg){
        System.out.println(i);
        System.out.println(this.i);
        System.out.println(arg.i);
        System.out.println("*****************");
    }
}
class Test7{
    public static void main(String[] args) {
        F f1=new F(10);
        F f2=new F(20);
        f1.display(f2);
        f2.display(f1);
        f2.display(f2);
        f2.display(new F(45));
        new F(25).display(f1);
    }
}
