abstract class Car {
    abstract void start();

    abstract void stop();

    abstract void accelerate();
}

class RangeRover extends Car {
    void start() {
        System.out.println("RangeRover started");
    }

    void stop() {
        System.out.println("RangeRover stopped");
    }

    void accelerate() {
        System.out.println("Speed increased");
    }
}

public class Test2 {
    public static void main(String[] args) {
        Car c = new RangeRover();
        c.start();
        c.accelerate();
        c.stop();
    }
}