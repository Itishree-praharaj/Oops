class Animal {
    void drinksWater() {
        System.out.println(this.getClass().getSimpleName() + " drinks water");
    }
    void sound(){

    }
    void movement(){

    }
}

class Lion extends Animal {
    void sound() {
        System.out.println("Lion roars");
    }

    void movement() {
        System.out.println("Lion walks/Runs");
    }
}

class Snake extends Animal {
    void sound() {
        System.out.println("hhhhhhhhhhhhhhhhsssssssssssssssssshhhhhhhhhh");
    }

    void movement() {
        System.out.println("Snake crawls");
    }
}

public class Test5 {
    public static void main(String[] args) {
        Animal a1=new Lion();
        a1.sound();
        a1.drinksWater();
        a1.movement();
        System.out.println("-------------------------");
        a1=new Snake(); 
        a1.drinksWater();
        a1.sound();
        a1.movement();
    }
}
