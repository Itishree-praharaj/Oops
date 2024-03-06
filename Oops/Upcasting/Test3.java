class Fruit{
    
}
class Mango extends Fruit{
   static int noOfMango=100;

}
class Kiwi extends Fruit{
    static int noOfKiwi=100;
}
class Shopkeeper{
    void sell(Fruit f){
        if(f instanceof Mango){
        Mango.noOfMango--;
        }
        else 
        Kiwi.noOfKiwi--;
    }
}
public class Test3 {
    public static void main(String[] args) {
        Mango mango = new Mango();
        Shopkeeper sk =new Shopkeeper();
        sk.sell(mango);
        System.out.println(mango.noOfMango);
    }
}
