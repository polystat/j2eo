
public class StatementsInBlock {
    public static void foo() {
        System.out.println("foo()");
    }

    public static void main(String[] args) {
        {
            int a = 1;
            foo();
            System.out.println("passed");
        }
    }
}
