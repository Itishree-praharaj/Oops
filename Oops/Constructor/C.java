class C {
    static int j = 45;
    int i = 21;

    C() {
        System.out.println("C constructor called");
    }

    C(int i, int j) {
        this.i = i;
        this.j = j;
        System.out.println(i);
        System.out.println(j);
    }
}

class test3 {
    C c3;

    void m1() {
        System.out.println(c3);
    }

    public static void main(String[] args) {
        C c1 = new C(10, 20);
        C c2 = new C();
        System.out.println(c1);
        System.out.println(c2.j);
    }
}