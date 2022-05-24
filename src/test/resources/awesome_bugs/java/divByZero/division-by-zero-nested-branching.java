public class Test {
    public static int test(boolean x, boolean y, int z, int w) {
        int result;
        if (x) {
            result = z;
        }
        else {
            if (y) {
                result = w / z;
            }
            else {
                result = w;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(test(false, true, 0, 0));
    }
}
