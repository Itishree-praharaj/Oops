public class Test2 {
    public static void main(String[] args) {
        Number i = 10;
        Object obj = 20;
        Test2 test2 = new Test2();
        System.out.println(test2);
        System.out.println((Integer) i * 2);
        System.out.println(obj);
        test2 = (Test2) obj;
        System.out.println(test2);// exception
    }
}
