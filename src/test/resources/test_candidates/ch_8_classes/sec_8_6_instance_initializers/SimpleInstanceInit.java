
public class SimpleInstanceInit {
    public int a;
    public int b = 1;
    {
        a = b + 1;
    }

    public static void main(String[] args) {
        SimpleInstanceInit s = new SimpleInstanceInit();
        System.out.println(s.a);
        System.out.println(s.b);
        System.out.println("passed");
    }
}
