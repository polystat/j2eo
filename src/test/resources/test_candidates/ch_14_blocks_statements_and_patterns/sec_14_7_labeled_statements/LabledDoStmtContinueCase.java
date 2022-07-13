
public class LabledDoStmtContinueCase {
    public static void main(String[] args) {
        int i = 0;
        outer:
            do {
                int j = 0;
                inner:
                    do {
                        if (i < j) break outer;
                        if (j < i) break inner;
                        System.out.println(i + " : " + j);
                    } while (j++ < 3);
            } while (i++ < 3);
        System.out.println("passed");
    }
}
