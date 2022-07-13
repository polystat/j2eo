
public class LabledWhileStmtContinueCase {
    public static void main(String[] args) {
        int i = 0;
        outer:
            while (i++ < 3) {
                int j = 0;
                inner:
                    while (j++ < 3) {
                        if (i < j) continue outer;
                        if (j < i) continue inner;
                        System.out.println(i + " : " + j);
                    }
            }
        System.out.println("passed");
    }
}
