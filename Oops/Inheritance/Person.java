class Person {
    String name;

    Person(String n) {
        name = n;
    }
}

class Teacher extends Person {
    String sub;

    Teacher(String n, String sub) {
        super(n);
        this.sub = sub;
    }
}

class Test3 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ballaya", "ClassicalDance");
        System.out.println(t1.name);
        System.out.println(t1.sub);

    }
}
