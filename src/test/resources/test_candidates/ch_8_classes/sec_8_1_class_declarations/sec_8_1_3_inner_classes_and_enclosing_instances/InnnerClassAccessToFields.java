
class Outer {
    public int i = 100;
    static void classMethod() {
        final int l = 200;
        class LocalInStaticContext {
            public int m = l; // OK
        }
        System.out.println(new LocalInStaticContext().m);
    }
    void foo() {
        class Local { // A local class
            public int j = i;
        }
        System.out.println(new Local().j);
    }
}

public class InnnerClassAccessToFields {
    public static void main(String[] args) {
        Outer.classMethod();
        new Outer().foo();
        System.out.println("passed");
    }
}
