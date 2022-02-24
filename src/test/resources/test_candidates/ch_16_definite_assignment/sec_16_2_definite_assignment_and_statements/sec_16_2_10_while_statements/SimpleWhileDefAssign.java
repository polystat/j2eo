public class SimpleWhileDefAssign {
    public static void main(String[] args) {
        int k;
        while (true) {
            k = 5;
            if (k > 0) break;
            k = 12;
        }
        System.out.println(k);
        System.out.println("passed");
    }
}
