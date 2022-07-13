
interface A {
    public String s();
}

class B implements A {
    @Override
    public String s() {
        return "Hi!";
    }
}

public class SimpleOverrideAnno {
    public static void main(String[] args) {
        System.out.println(new B().s());
        System.out.println("passed");
    }
}
