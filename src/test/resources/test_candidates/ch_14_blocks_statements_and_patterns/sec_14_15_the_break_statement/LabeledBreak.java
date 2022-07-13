public class LabeledBreak {
    public static void main(String[] args) {
    outer:
        {
            int a = 0;
            while (true) {
                while (true) {
                    if (a++ > 10) {
                        break outer;
                    }
                }
            }
        }
        System.out.println("passed");
    }     
}
