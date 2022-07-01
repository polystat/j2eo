
public class AssertWithIdentityByteExpression {
	public static void main(String[] args) {
		assert (byte) 0 == (byte) 0 : "Never printed!";
		System.out.println("passed");
	}
}
