public class SerializableArraySubtyping {
    public static void main(String[] args) {
        Object[] objs = new Object[] { true, 0, .5f };
        java.io.Serializable ser = objs;
        System.out.println(ser.getClass().getName());
        System.out.println("passed");
    }
}
