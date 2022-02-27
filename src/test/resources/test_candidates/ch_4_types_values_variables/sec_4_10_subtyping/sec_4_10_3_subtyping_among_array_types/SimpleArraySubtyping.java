public class SimpleArraySubtyping {
    public static void main(String[] args) {
        Object[] objs = new Object[] { "some", 5, new byte[] { 0, 0, 1, 0 } };
        Object obj = objs;
        System.out.println(obj);
        System.out.println("passed");
    }    
}
