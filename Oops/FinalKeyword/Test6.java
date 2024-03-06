class bank {
    final int accntNo;
    final String name;
    static int num = 0;
    {
        accntNo = ++num;
    }

    bank(String name) {
        this.name = name;
    }
}

class clerk {
    public static bank createAccount() {
        System.out.println("Enter your name");
        String name = new java.util.Scanner(System.in).nextLine();
        return new bank(name);
    }

    public static void showDetails(bank b) {
        System.out.println("Account number = " + b.accntNo);
        System.out.println("Name is " + b.name);
    }
}

public class Test6 {
    public static void main(String[] args) {
        bank b1 = clerk.createAccount();
        clerk.showDetails(b1);
        b1 = clerk.createAccount();
        clerk.showDetails(b1);
    }
}
