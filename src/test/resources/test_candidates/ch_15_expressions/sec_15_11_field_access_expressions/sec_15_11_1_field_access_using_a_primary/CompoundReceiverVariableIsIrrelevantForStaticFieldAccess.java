public class CompoundReceiverVariableIsIrrelevantForStaticFieldAccess {
	public static void main(String[] args) {
		System.out.println(S.test().tt.t);
		System.out.println("passed");
	}
}

class T {
	static int t = 1;
}

class S {
	static T tt = null;
	static S test() { return null; }
}
