
public class MethodArgVarInit {
    public static void m(int variable) {
        variable += 1;
        System.out.println(variable);
    }

    public static void main(String[] args) {
        int variable = 0;
        m(variable);
        System.out.println(variable);
        System.out.println("passed");
    }
}
