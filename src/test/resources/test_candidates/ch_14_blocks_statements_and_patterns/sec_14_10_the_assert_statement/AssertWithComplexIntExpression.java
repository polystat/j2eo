
public class AssertWithComplexIntExpression {
	public static void main(String[] args) {
		int a = 0;
		int b = -1;
		assert (b = ++a) > 0 : "Never printed";
		System.out.println("passed");
	}
}
