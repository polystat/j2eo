class A {
    public int doSomething(float v) {
        return 10 / (int)v;
    }
}

public class Test {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.doSomething(0.1F));
    }
}
