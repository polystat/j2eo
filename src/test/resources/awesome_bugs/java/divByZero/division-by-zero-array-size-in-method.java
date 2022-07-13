import java.util.Vector;

class A {
    public void doSomething(Vector<String> args) {
        System.out.println(10 / args.size());
    }
}

public class Test {
    public static void main(String[] args) {
        A a = new A();
        Vector<String> v_s = new Vector<>();
        cout << a.doSomething(v_s);
    }
}
