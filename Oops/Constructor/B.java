class B {
    B(){
        System.out.println("Constructor called");
    }
}
class test2{
    public static void main(String[] args) {
        System.out.println(new B());
    }
}
