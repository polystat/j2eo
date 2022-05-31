public class Test {
    public static int test(int x) {
        return 100 / (100 * (100 + (100 - x)));
    }
    public static void main(String[] args) {
        System.out.println(test(200));
    }
}
