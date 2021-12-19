public class SimpleInterfaceInheritanceNOverride {

    public static void main(String[] args) {
        System.out.println(new Test().name());
        System.out.println("passed");
    }
}
interface Top {
    default String name() { return "unnamed"; }
}
interface Left extends Top {
    default String name() { return getClass().getName(); }
}
interface Right extends Top {}
interface Bottom extends Left, Right {}
class Test implements Bottom {}