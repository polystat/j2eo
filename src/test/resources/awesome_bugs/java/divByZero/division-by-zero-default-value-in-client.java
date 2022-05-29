class A {
    private int value;
    public int getValue() { return value; }
    public void setValue(int v) { value = v; }
}

public class Test {
    public static void main(String[] args) {
        A a = new A();
        int result = 10 / a.getValue();
        System.out.println(result);
    }
}
