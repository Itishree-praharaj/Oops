class D {
    int i;
    int j;

    D() {
        System.out.println("D class no argument constructor");
    }

    D(int i) {
        this.i = i;
    }

    D(int i, int j) {
        this(i);
        this.j = j;
    }

    static void display(D a) {
        System.out.println(a.i);
        System.out.println(a.j);
    }
    D(D a){
        this.i=a.i;
        this.j=a.j;
    }
}

public class Test4 {
    public static void main(String[] args) {
        D d1 = new D(10);
        D d2 = new D(20, 30);
        D.display(d1);
        D.display(d2);
        D d3 = new D();
        D.display(d3);
        D d4=new D(d2);
        D.display(d4);
    }
}
