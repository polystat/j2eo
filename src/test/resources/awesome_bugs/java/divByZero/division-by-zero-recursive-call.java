class A {
    public int doSomething(int number) {
        if (number < 0) { return 1; }
        return number / doSomething(number - 1);
    }
}

public class Test {
    public static void main(String[] args) {
        A a = new A();
        int result = a.doSomething(5);
        System.out.println(result);
    }
}
