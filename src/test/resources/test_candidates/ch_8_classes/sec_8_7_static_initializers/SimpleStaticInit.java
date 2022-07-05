
public class SimpleStaticInit {
    public static int stField = 10;
    static {
        stField = 0;
    }

    public static void main(String[] args) {
        System.out.println(stField);
        System.out.println("passed");
    }
}
