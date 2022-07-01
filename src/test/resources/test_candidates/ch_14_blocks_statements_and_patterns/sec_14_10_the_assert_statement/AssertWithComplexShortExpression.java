
public class AssertWithComplexShortExpression {
	public static void main(String[] args) {
		short a = (short) 0;
		short b = (short) -1;
		assert (b = ++a) > (short) 0 : "Never printed";
		System.out.println("passed");
	}
}
