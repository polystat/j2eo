
public class AssertWithIdentityShortExpression {
	public static void main(String[] args) {
		assert (short) 0 == (short) 0 : "Never printed!";
		System.out.println("passed");
	}
}
