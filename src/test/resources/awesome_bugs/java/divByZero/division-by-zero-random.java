import java.util.Random;

class A {
    private int value;
    public int getValue() { return value; }
    public void setValue(int v) { value = v; }
    public int doSomething(int v) {
        return v / value;
    }
}

public class Test {
    public static void main(String[] args) {
        A a = new A();
        Random rand = new Random();
        int randomNumber = rand.nextInt();
        a.setValue(randomNumber);
        System.out.println(a.doSomething(10));
    }
}
