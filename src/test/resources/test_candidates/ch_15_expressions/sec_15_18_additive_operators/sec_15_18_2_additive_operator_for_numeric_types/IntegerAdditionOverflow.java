public class IntegerAdditionOverflow {
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        a += 10;
        System.out.println(a);
        System.out.println("passed");
    }
}
