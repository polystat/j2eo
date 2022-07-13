
public class LabledForStmtBreakCase {
    public static void main(String[] args) {
        outer:
            for (int i = 0; i < 3; i++) {
                inner:
                    for (int j = 0; j < 3; j++) {
                        if (i < j) break inner;
                        if (j < i) break outer;
                        System.out.println(i + " : "  + j);
                    }
            }
        System.out.println("passed");
    }
}
