
public class AssertWithComplexRefExpression {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        assert ((b = a) + (a = b)).equals(a + b) : "Never printed";
        System.out.println("passed");
    }
}
