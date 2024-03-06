public class Circle {
    int radius;
    Circle(int r){
        radius=r;
    }
    void displayDetails(){
        System.out.println("Radius = "+this.radius);
    }
}
class Test3{
    public static void main(String[] args) {
        Circle c1 = new Circle(2);
        c1.displayDetails();
    }
}
