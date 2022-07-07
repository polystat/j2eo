
public class SwitchStmtPattern {
    public static void main(String[] args) {
        Object o = "Hello!";
        if (o instanceof String s) {
            switch (s.length()) {
                case 6 -> System.out.println(s);
                default -> System.out.println("not passed");
            }
        } else {
            System.out.println("not passed");
        }
        System.out.println("passed");
    }
}
