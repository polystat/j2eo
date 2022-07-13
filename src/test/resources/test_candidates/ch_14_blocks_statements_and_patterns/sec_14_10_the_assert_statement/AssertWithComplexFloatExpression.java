
public class AssertWithComplexFloatExpression {
	public static void main(String[] args) {
		float a = 0f;
		float b = -1f;
		assert (b = ++a) > 0f : "Never printed";
		System.out.println("passed");
	}
}
