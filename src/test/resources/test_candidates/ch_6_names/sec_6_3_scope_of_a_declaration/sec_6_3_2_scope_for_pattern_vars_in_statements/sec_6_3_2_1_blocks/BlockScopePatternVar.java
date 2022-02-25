import java.util.function.Consumer;

public class BlockScopePatternVar {
    public static void main(String[] args) {
        Object obj = "passed";
        Consumer<Object> consumer = o -> {
            if (obj instanceof String s) {
                System.out.println(s);
            } else {
                System.out.println("not passed");
            }
        };
        consumer.accept(obj);
    }
}
