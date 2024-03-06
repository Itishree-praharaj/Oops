
public class Car {
    Engine cc;
    double price;

    public Car(int cc, double price) {
        this.cc = new Engine(cc);
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Car))
            return false;
        Car c = (Car) obj;
        return price == c.price && cc.equals(c.cc);
    }
}
