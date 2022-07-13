
public class AssertWithIdentityRefExpression {
    public static void main(String[] args) {
        assert "String".equals("String") : "Never printed";
        System.out.println("passed");
    }
}
