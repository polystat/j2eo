public class Test {
    public static int test(boolean x) {
        int intX = x ? 1 : 0;
        return 100 / intX;
    }
    public static void main(String[] args) {
        System.out.println(test(false));
    }
}
