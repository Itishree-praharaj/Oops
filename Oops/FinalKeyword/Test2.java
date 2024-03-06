class car{
   final double price=1000000;
   car(int i){
    price=i;
   }
}
public class Test2 {
    public static void main(String[] args) {
        final car c1 = new car(15000);
        System.out.println(c1.price);
    }
}
 