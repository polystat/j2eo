
public class AssertWithComplexCharExpression {
	public static void main(String[] args) {
		char a = '\u0000';
		char b = '\u0000';
		assert (b = ++a) > '\u0000' : "Never printed";
		System.out.println("passed");
	}
}
