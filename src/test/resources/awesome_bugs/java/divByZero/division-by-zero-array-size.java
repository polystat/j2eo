import java.util.Vector;

public class Test {
    public static int test(int x) {
        Vector<Integer> a = new Vector<>();
        return x / a.size();
    }
    public static void main(String[] args) {
        System.out.println(test(100));
    }
}
