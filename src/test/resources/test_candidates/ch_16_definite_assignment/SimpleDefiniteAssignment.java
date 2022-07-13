public class SimpleDefiniteAssignment {
    public static void main(String[] args) {
        int k, a = 5;
        if (a < 10 && (k = 15) >= 0) {
            System.out.println(k);
        }
        System.out.println("passed");
    }    
}
