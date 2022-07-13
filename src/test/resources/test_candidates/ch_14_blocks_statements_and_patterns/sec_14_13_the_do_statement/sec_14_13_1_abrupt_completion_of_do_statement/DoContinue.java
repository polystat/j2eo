
public class DoContinue {
    public static void main(String[] args) {
        int i = 0;
        do {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        } while (i++ < 10);
        System.out.println("passed");
    }
}
