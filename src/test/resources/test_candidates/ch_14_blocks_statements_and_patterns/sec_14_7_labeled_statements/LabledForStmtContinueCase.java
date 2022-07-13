
public class LabledForStmtContinueCase {
    public static void main(String[] args) {
        outer:
            for (int i = 0; i < 3; i++) {
                inner:
                    for (int j = 0; j < 3; j++) {
                        if (i < j) continue outer;
                        if (j < i) continue inner;
                        System.out.println(i + " : "  + j);
                    }
            }
        System.out.println("passed");
    }
}
