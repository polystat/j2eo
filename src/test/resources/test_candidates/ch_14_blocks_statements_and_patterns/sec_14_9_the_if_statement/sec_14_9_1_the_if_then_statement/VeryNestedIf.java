
public class VeryNestedIf {
    public static void main(String[] args) {
        boolean truth = true;
        if (truth) {
            if (truth) {
                if (truth) {
                    System.out.println("passed");
                }
            }
        }
    }
}
