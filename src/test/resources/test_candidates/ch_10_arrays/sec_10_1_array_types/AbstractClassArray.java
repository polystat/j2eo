public class AbstractClassArray {
    public static void main(String[] args) {
        AbsSome[] arr = new AbsSome[] { null };
        System.out.println(arr.length);
        System.out.println("passed");
    }   
}

abstract class AbsSome {
    abstract void func();
}