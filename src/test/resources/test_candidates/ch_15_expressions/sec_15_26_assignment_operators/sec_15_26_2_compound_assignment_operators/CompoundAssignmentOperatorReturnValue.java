
public class CompoundAssignmentOperatorReturnValue {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		System.out.println(a += b);
		System.out.println(a -= b);
		System.out.println(a *= b);
		System.out.println(a /= b);
		System.out.println(a &= b);
		System.out.println(a |= b);
		System.out.println(a ^= b);
		System.out.println(a <<= b);
		System.out.println(a >>= b);
		System.out.println(a >>>= b);
		System.out.println("passed");
	}
}
