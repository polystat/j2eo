public class LabeledContinue {
    public static void main(String[] args) {
    outer_loop:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j > 0) {
                    continue outer_loop;
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
        System.out.println("passed");
    }    
}
