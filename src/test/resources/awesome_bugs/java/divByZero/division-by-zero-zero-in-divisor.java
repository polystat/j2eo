public class Test {
    public static int test() {
        return 1 / 0;
    }

    public static void main(String[] args) {
        System.out.println(test());
    }
}
