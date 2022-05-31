import java.util.Random;

class Base {
    private int x = 0;
    public int getX() { return x; }
    public void n() {
        x = 0;
    }
    public void m() {
        x++;
    }
    public void o() {
        m();
    }
}

class Derived extends Base {
    @Override
    public void n() {
        Random rand = new Random();
        int randomNumber = rand.nextInt();
        if (randomNumber == 0) {
            m();
        }
    }
    public void m() {
        o();
    }
}

public class Test {
    public static void main(String[] args) {
        Base derivedInstance = new Derived();
        derivedInstance.n();
    }
}
