class F {
    F m1() {
        System.out.println("f");
        return new F();
    }
}

class G extends F {
    @Override
    H m1() {
        System.out.println("g");
        return new H();
    }
}

class H extends G {
    @Override
    H m1() {
        System.out.println("h");
        return new H();
    }

    public void m2() {
        System.out.println("hi from class h");
    }

    @Override
    public String toString() {
        return "H";
    }
}

public class Test3 {
    public static void main(String[] args) {
        F h1 = new H();
        System.out.println(h1.m1());
        // (h1.m1()).m2();
        // System.out.println(h2);
    }
}