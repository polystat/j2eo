
public class LabeledStmtPattern {
    public static void main(String[] args) {
        Object o = "Hello!";
        label:
            if (o instanceof String s) {
                System.out.println(s);
            } else {
                System.out.println("not passed");
            }
        System.out.println("passed");
    }
}
