public class SuperInterfaceSubtyping {
    public static void main(String[] args) {
        new SomeClass().check();
        System.out.println("passed");
    }   
}

interface ISuper {}

class SomeClass implements ISuper {
    void check() {
        System.out.println(this instanceof ISuper);
    }
}