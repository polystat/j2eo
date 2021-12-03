
public class SimpleVoidStrictFpExpression {
    public static strictfp void test() {}

    public static void main(String[] args) {
        test();
        System.out.println("passed");
    }
}
