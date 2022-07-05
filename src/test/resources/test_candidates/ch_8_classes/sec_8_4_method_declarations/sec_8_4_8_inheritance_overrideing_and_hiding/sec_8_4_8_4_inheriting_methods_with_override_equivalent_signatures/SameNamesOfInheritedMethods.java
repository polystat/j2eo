
class A {
    public void p() {
        System.out.println("Hi!");
    }
}

interface B {
    public void p(String s);
}

class C extends A implements B {
    public void p() {
        System.out.println("Buy!");
    }
    public void p(String s) {
        System.out.println(s);
    }
}

public class SameNamesOfInheritedMethods {
    public static void main(String[] args) {
        C c = new C();
        c.p();
        c.p("Good!");
        System.out.println("passed");
    }
}
