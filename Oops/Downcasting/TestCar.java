interface Car {
    void start();

    void accelerate();

    void stop();
}

class RangeRover implements Car {
    public void start() {
        System.out.println(this.getClass().getSimpleName() + " started");
    }

    @Override
    public void accelerate() {
        System.out.println(this.getClass().getSimpleName() + " accelerated");
    }

    @Override
    public void stop() {
        System.out.println(this.getClass().getSimpleName() + " stoped");
    }

    public void engage4x4() {
        System.out.println("4 X 4 engaged for RangeRover");
    }

    public void accessBluetooth() {
        System.out.println("JBL bluetooth accessed for RangeRover");
    }
}

class Benz implements Car {
    public void start() {
        System.out.println(this.getClass().getSimpleName() + " started");
    }

    @Override
    public void accelerate() {
        System.out.println(this.getClass().getSimpleName() + " accelerated");
    }

    @Override
    public void stop() {
        System.out.println(this.getClass().getSimpleName() + " stoped");
    }

    public void openSunRoof() {
        System.out.println("SunRoof opened for Benz");
    }

    public void accessBluetooth() {
        System.out.println("OnePlus bluetooth accessed for Benz");
    }
}

class Audi implements Car {
    public void start() {
        System.out.println(this.getClass().getSimpleName() + " started");
    }

    @Override
    public void accelerate() {
        System.out.println(this.getClass().getSimpleName() + " accelerated");
    }

    @Override
    public void stop() {
        System.out.println(this.getClass().getSimpleName() + " stoped");
    }

    public void sportsMode() {
        System.out.println("Sports mode engaged for Audi");
    }

    public void accessBluetooth() {
        System.out.println("Samsung blutooth accessed");
    }
}

class Driver {
    static Car drive(Car c) {
        if (c instanceof RangeRover) {
            return new RangeRover();
        } else if (c instanceof Benz) {
            return new Benz();
        } else if (c instanceof Audi) {
            return new Audi();
        }
        return null;
    }
}

public class TestCar {
    public static void main(String[] args) {
        Car c1 = Driver.drive(new Audi());
        c1.start();
        c1.accelerate();
        c1.stop();
        // Benz b=(Benz)c1; we cannot downcast Audi type to benz type
        ((Audi) c1).sportsMode();
        ((Audi) c1).accessBluetooth();
        System.out.println("**************");
        c1 = Driver.drive(new RangeRover());
        c1.start();
        c1.accelerate();
        c1.stop();
        ((RangeRover) c1).engage4x4(); // DownCasting
        System.out.println("**************");
        c1 = Driver.drive(new Benz());
        c1.start();
        c1.accelerate();
        c1.stop();
        // c1.openSunRoof();
        ((Benz) c1).openSunRoof();

    }
}