
public class SimpleNonVoidStrictFpExpression {
    public static strictfp float test() {
        return 0f;
    }

    public static void main(String[] args) {
        float f = test();
        System.out.println(f);
        System.out.println("passed");
    }
}
