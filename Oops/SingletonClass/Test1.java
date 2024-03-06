
class A {
    private static A obj;

    private A() {

    }

    public static A getInstance() {
        if (obj == null)
            obj = new A();
        return obj;
    }
}

public class Test1 {
    public static void main(String[] args) {
        A a1 = A.getInstance();
        System.out.println(a1);
        A a2 = A.getInstance();
        System.out.println(a2);
    }
}
// A class which allows only one instance through out the application is known
// as Singleton class.
// it contains a private constructor
// it contains a public static method which return the new instance for the first call and the same instance for next calls