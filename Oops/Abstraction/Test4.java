abstract class Phone {
    abstract void cal();

    abstract void sendMsg();
}

abstract class Keypad extends Phone {
    @Override
    void cal() {
        System.out.println("Calling from keypad ");
    }

    @Override
    void sendMsg() {
        System.out.println("Sending msg");
    }

    abstract void radio();
}

class SmartPhone extends Keypad {
    @Override
    void cal() {
        System.out.println("Calling from SmartPhone");
    }

    @Override
    void sendMsg() {
        System.out.println("Sending msg from smart phone");
    }

    @Override
    void radio() {
        System.out.println("Radio is on");
    }
}

public class Test4 {
    public static void main(String[] args) {
        Phone p = new SmartPhone();
        p.cal();
        p.sendMsg();
        ((SmartPhone) p).radio(); // because radio method is not available in Phone class
                                  // we have to downcast it to SmartPhone type
    }
}