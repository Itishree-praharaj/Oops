class A {
    public static void main(String[] args) {
        Test1 t = new Test1();
        // t.m1();
        t.m2(1);
    }

}

class Test1 {
    int i;

    static void m1() {
        System.out.println("M1 method called ");
    }

    void m2(int i) {
        this.i = i;
        System.out.println(i);
        System.out.println(this.i);
        System.out.println("M2 method called");
    }
}
