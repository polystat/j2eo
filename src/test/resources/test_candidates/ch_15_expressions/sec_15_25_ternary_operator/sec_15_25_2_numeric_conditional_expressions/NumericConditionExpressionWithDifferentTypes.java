
public class NumericConditionExpressionWithDifferentTypes {
	public static void main(String[] args) {
		byte a = 1;
		short b = 1;
		short c = true ? a : b;
		System.out.println(c);
		System.out.println("passed");
	}
}
