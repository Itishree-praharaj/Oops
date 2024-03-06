class A {
    A(){
        System.out.println("Default constructor");
    }    
    A(int i){
        this();
        System.out.println("Integer Argument constructor "+i);
    }
    A(int i,int j){
        this(i);
        System.out.println("2 integer Argument constructor "+i+" "+j);
    }
}
class Test1{
    public static void main(String[] args) {
        new A(10,20);
    }
}
