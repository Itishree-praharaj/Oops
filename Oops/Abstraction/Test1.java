abstract class Animal{
    void drinkWater(){
        System.out.println("Drinks water");
    }

    abstract void sound();
    abstract void movement();
}
class Lion extends Animal{
    @Override
    void sound() {
        System.out.println("Roars");
    }
    @Override
    void movement() {
        System.out.println("Walks");
    }
}
public class Test1 {
    public static void main(String[] args) {
        Animal a = new Lion();
        a.drinkWater();
        a.movement();
        a.sound();
    }
}
