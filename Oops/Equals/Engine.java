public class Engine {
    int cc;

    public Engine(int cc) {
        this.cc = cc;
    }

    @Override
    public boolean equals(Object obj) {
        return cc == ((Engine) obj).cc;
    }
}
