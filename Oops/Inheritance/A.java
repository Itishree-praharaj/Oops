class A {
    int i;
{
    i=10;
}
    A(int i) {
        this.i = i;
    }
}

class B extends A {
    int j;
    B(int j,int i) {
        super(i);
        this.j = j;
    }
}

class Test1 {
    public static void main(String[] args) {
        B b1 = new B(20,10);
        System.out.println(b1.i);
        System.out.println(b1.j);
        B b2 = new B(30,40);
        System.out.println(b2.i);
        System.out.println(b2.j);
    }
}