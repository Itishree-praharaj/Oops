interface RR {
    void engage4x4();
}

interface Mercedes {
    void openSunroof();
}

abstract class Car {
    void playMusic() {
        System.out.println("Playing Music...");
    }

    public abstract void start();

    public abstract void engineOff();

    public abstract void accelerate();

    public abstract void brake();
}

class RangeRover extends Car implements RR {
    @Override
    public void start() {
        System.out.println("Range Rover Started ");
    }

    @Override
    public void engineOff() {
        System.out.println("Engine off");
    }

    @Override
    public void accelerate() {
        System.out.println("Speed increased");
    }

    @Override
    public void brake() {
        System.out.println("Speed decreased");
    }

    @Override
    public void engage4x4() {
        System.out.println("4x4 engaged");
    }
}

class Benz extends Car implements Mercedes {
    public void start() {
        System.out.println("Benz Started");
    }

    @Override
    public void engineOff() {
        System.out.println("Engine off");
    }

    @Override
    public void accelerate() {
        System.out.println("Speed increased");
    }

    @Override
    public void brake() {
        System.out.println("Speed decreased");
    }

    @Override
    public void openSunroof() {
        System.out.println("Opening Sunroof");
    }
}

class Driver {
    static void drive(Car c) {
        System.out.println("Driving " + c.getClass().getSimpleName());
    }
}

public class Test2 {
    public static void main(String[] args) {
        RangeRover r = new RangeRover();
        Driver.drive(r);
        r.playMusic();
        r.start();
        r.engage4x4();
        r.accelerate();
        r.brake();
        r.engineOff();
        Benz b = new Benz();
        System.out.println("************************");
        b.start();
        b.openSunroof();
        b.accelerate();
        b.brake();
        b.playMusic();
        b.engineOff();
    }
}
