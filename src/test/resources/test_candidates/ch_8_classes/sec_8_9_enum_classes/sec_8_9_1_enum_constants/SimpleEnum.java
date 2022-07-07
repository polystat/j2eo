
enum A {
    ONE, TWO;
}

public class SimpleEnum {
    public static void main(String[] args) {
        A[] as = { A.ONE, A.TWO };
        for (A item: as) {
            if (item == A.ONE) {
                System.out.println("item is ONE");
            }
            if (item == A.TWO) {
                System.out.println("item is TWO");
            }
        }
        System.out.println("passed");
    }
}
