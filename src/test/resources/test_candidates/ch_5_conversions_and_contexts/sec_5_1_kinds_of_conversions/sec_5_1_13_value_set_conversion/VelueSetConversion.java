
public class VelueSetConversion {
    public static void main(String[] args) {
        float a = 1e9f;
        double b = a; // Implicit conversion
        System.out.println(a);
        System.out.println(b);
        System.out.println("passed");
    }
}
