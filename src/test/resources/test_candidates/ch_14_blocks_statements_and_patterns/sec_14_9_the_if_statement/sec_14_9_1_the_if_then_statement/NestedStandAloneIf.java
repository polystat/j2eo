
public class NestedStandAloneIf {
    public static void main(String[] args) {
        boolean truth = true;
        if (truth)
            if (truth)
                System.out.println("ok");
        System.out.println("passed");
    }
}
