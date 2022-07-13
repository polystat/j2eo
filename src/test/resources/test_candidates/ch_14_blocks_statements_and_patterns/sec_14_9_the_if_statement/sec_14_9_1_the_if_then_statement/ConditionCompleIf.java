
public class ConditionCompleIf {
    public static boolean cond(int a, boolean b) {
        if (a > 0) {
            return cond(--a, !b);
        }
        return b;
    }
    public static void main(String[] args) {
        System.out.println("it is " + cond(10, true));
        System.out.println("passed");
    }
}
