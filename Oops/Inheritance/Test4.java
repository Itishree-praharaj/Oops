class F{
    int i;
    static int j;
}
class G extends F{
    void display(){
        System.out.println(j);
    }
}
public class Test4 {
    public static void main(String[] args) {
    G g =  new G();
        g.display();
    }
}
