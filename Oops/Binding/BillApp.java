
import java.util.Scanner;

class Product {
    int prodId;
    String prodName;
    int quantity;
    double price;
    double totalPrice;
    Product(int prodId, String prodName, int quantity, double price,double totalPrice) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.quantity = quantity;
        this.price = price;
        this.totalPrice=totalPrice;
    }
}

class BillGenerator {
    public static Product generateBill(Product p) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product id ");
        int id = sc.nextInt();
        System.out.println("Enter the product name ");
        String name = sc.next();
        System.out.println("Enter the quantity");
        int quantity = sc.nextInt();
        System.out.println("Enter the price ");
        double price = sc.nextDouble();
        double totalPrice=price*quantity;
        return new Product(id, name, quantity, price,totalPrice);
    }
}

class Biller {
    public static void displayBill(Product p) {
        System.out.println();
        System.out.print("\tProduct id = " + p.prodId);
        System.out.print("\tproduct name = " + p.prodName);
        System.out.print("\tquantity = " + p.quantity);
        System.out.print("\tprice = " + p.price);
        System.out.print("\ttotal price = "+p.totalPrice);
        System.out.println();
    }
}

public class BillApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product details ");
        boolean on = true;
        while (on) {
            Product p1 = BillGenerator.generateBill(null);
            Biller.displayBill(p1);
            System.out.println("Do you want to continue \n1-->yes\n2-->no");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    on = true;
                    break;
                case 2:
                    on = false;
                    break;
                default:
                    System.out.println("Enter a valid input");
            }
        }
    }
}
