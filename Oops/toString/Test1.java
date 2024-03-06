class A {
    int i = 10;

    void m1() {
        System.out.println("hi");
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "A class Object";
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        // return super.equals(obj);
        return this.getClass() == obj.getClass();// we can know both the object are from same class or not
    }
}

public class Test1 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        System.out.println(a1.toString());
        System.out.println(a1.equals(a2));
    }
}
