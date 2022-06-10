
class A {
    public A(int param) {
        param += 1;
        System.out.println(param);
    }
}

public class ConstructorArgVarInit {
    public static void main(String[] args) {
        int variable = 0;
        new A(variable);
        System.out.println(variable);
        System.out.println("passed");
    }
}
