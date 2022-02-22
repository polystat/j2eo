public class ReceiverVariableIsIrrelevantForStaticFieldAccess {
	public static void main(String[] args) {
		System.out.println(S.test().s);
		System.out.println("passed");
	}
}

class S {
	static int s = 0;
	static S test() { return null; }
}
