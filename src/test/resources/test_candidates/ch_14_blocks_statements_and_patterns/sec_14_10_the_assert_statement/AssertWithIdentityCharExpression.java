
public class AssertWithIdentityCharExpression {
	public static void main(String[] args) {
		assert 'A' == 'A' : "Never printed!";
		System.out.println("passed");
	}
}
