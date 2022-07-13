
class A {
    interface B {
        class C {
            public void m() {
                System.out.println("I am static!");
            }
        }
    }
}

public class NoInnerClassMemberOfInterface {
    public static void main(String[] args) {
        new A.B.C().m();
        System.out.println("passed");
    }
}
