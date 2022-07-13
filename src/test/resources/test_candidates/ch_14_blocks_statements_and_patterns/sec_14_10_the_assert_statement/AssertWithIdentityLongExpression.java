
public class AssertWithIdentityLongExpression {
	public static void main(String[] args) {
		assert 0L == 0L : "Never printed!";
		System.out.println("passed");
	}
}
