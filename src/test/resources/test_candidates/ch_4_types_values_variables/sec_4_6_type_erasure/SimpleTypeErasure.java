
public class SimpleTypeErasure<T> {
    T value;

    SimpleTypeErasure(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        SimpleTypeErasure<Integer> se = new SimpleTypeErasure("string");
        System.out.println(se.value);
        System.out.println("passed");
    }
}
