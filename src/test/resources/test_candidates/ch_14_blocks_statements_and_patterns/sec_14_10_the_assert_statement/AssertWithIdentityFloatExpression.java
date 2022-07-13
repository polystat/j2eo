
public class AssertWithIdentityFloatExpression {
	public static void main(String[] args) {
		assert 0f == 0f : "Never printed!";
		System.out.println("passed");
	}
}
