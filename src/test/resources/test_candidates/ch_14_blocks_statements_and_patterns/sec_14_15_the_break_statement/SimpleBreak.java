public class SimpleBreak {
    public static void main(String[] args) {
        int a = 0;
        while (true) {
            if (a++ > 10) {
                break;
            }
        }
        System.out.println("passed");
    }
}
