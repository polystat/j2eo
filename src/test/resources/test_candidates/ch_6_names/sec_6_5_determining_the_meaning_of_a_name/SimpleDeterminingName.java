
public class SimpleDeterminingName {
    public static void main(String[] args) {
        String a = "Hello!";
        class Local {
            {
                for (int a = 0; a < 10; a++)
                    System.out.println(a);
            }
        }
        new Local();
        System.out.println(a);
        System.out.println("passed");
    }
}
