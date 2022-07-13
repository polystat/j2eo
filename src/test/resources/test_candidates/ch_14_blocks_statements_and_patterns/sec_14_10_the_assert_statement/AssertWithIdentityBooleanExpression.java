
public class AssertWithIdentityBooleanExpression {
	public static void main(String[] args) {
		assert false == false : "Never printed!";
		System.out.println("passed");
	}
}
