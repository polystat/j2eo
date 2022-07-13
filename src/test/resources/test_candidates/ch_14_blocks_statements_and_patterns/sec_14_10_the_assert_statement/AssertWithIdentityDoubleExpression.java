
public class AssertWithIdentityDoubleExpression {
	public static void main(String[] args) {
		assert 0d == 0d : "Never printed!";
		System.out.println("passed");
	}
}
