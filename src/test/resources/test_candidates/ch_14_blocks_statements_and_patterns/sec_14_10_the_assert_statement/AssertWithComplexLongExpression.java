
public class AssertWithComplexLongExpression {
	public static void main(String[] args) {
		long a = 0L;
		long b = -1L;
		assert (b = ++a) > 0L : "Never printed";
		System.out.println("passed");
	}
}
