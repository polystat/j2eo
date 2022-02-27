public class CloneableArraySubtyping {
    public static void main(String[] args) {
        Object[] objs = new Object[] { "some", 5, .3f };
        Cloneable cln = objs;
        System.out.println(cln.getClass());
        System.out.println("passed");
    }
}
