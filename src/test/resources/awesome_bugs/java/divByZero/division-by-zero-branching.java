public class Test {
    public static int test(boolean x, int y, int z) {
        int result;
        if (x) {
            result = y;
        }
        else {
            result = z / y;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(test(false, 0, 0));
    }
}
