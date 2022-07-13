public class ScopeOfLocalVarDeclr1 {
    static int x;
    public static void main(String[] args) {
        System.out.print("2+1=");
        int two = 2, three = two + 1;
        System.out.println(three);
        System.out.println("passed");
    }
}
