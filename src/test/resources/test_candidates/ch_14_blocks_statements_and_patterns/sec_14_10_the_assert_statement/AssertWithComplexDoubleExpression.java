
public class AssertWithComplexDoubleExpression {
	public static void main(String[] args) {
		double a = 0d;
		double b = -1d;
		assert (b = ++a) > 0d : "Never printed";
		System.out.println("passed");
	}
}
