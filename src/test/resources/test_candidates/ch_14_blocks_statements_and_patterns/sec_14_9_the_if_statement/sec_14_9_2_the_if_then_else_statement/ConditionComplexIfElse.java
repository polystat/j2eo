
public class ConditionComplexIfElse {
    public static boolean cond(int a, int b) {
        System.out.println(a + ", " + b);
        if (b < 0) {
            return false;
        }
        if (b > 10) {
            return true;
        }

        if (a % b == 0 && b != 1) {
            a++;
            return cond(++a, ++b);
        } else {
            b--;
            return cond(--a, --b);
        }
    }
    public static void main(String[] args) {
        System.out.println("cond(8, 5) = " + cond(8, 5));
        System.out.println("cond(6, 5) = " + cond(6, 3));
        System.out.println("passed");
    }
}
