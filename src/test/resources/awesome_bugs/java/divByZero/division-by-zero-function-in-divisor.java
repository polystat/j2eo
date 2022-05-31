public class Test {
    public static int f(int y) {
        return y;
    }
    public static int test(int x, int y) {
        return x / f(y);
    }

    public static void main(String[] args) {
        System.out.println(test(1, 0));
    }
}
