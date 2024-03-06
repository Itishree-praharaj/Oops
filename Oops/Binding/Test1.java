
import java.util.Scanner;

class Book {
    static int count;
    String bookName;
    int bookId;
    String author;
    int pages;
    double price;

    Book(String bookName, int bookId, String author, int pages, double price) {
        this.bookName = bookName;
        this.author = author;
        this.pages = pages;
        this.bookId = bookId;
        this.price = price;
        count++;
    }
}

class BookFactory {
    public static Book createBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bookid ");
        int id = sc.nextInt();
        System.out.println("Enter the bookname");
        String name = sc.next();
        System.out.println("Enter the Author Name ");
        String author = sc.next();
        System.out.println("Enter number of pages");
        int pages = sc.nextInt();
        System.out.println("Enter the price");
        double price = sc.nextDouble();
        Book b1 = new Book(name, id, author, pages, price);
        return b1;
    }
}

class BookInfoFactory {
   public static void showdetails(Book b1) {
        System.out.println("Name : " + b1.bookName);
        System.out.println("BookId : " + b1.bookId);
        System.out.println("Author : " + b1.author);
        System.out.println("No of pages : " + b1.pages);
        System.out.println("Price of the book : " + b1.price);
        System.out.println("---------------------------------------------");
    }
}

public class Test1 {
    public static void main(String[] args) {
        BookFactory bf = new BookFactory();
        Book b1 = bf.createBook();
        BookInfoFactory bif = new BookInfoFactory();
        Book b2 =bf.createBook();
        bif.showdetails(b1);
        BookInfoFactory.showdetails(b2);
        System.out.println("Total number of books  = "+Book.count);
    }
}