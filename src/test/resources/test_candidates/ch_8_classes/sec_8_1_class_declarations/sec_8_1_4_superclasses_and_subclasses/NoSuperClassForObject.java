
public class NoSuperClassForObject {
    public static void main(String[] args) {
        Object o = new Object();
        System.out.println(o.getClass().getSuperclass());
        System.out.println("passed");
    }
}
