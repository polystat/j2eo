
public class LabledDoStmtBreakCase {
    public static void main(String[] args) {
        int i = 0;
        outer:
            do {
                int j = 0;
                inner:
                    do {
                        if (i < j) continue inner;
                        if (j < i) continue outer;
                        System.out.println(i + " : " + j);
                    } while (j++ < 3);
            } while (i++ < 3);
        System.out.println("passed");
    }
}
