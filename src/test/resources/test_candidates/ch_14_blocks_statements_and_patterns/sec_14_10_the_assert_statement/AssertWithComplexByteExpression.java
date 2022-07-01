
public class AssertWithComplexByteExpression {
	public static void main(String[] args) {
		byte a = (byte) 0;
		byte b = (byte) -1;
		assert (b = ++a) > (byte) 0 : "Never printed";
		System.out.println("passed");
	}
}
