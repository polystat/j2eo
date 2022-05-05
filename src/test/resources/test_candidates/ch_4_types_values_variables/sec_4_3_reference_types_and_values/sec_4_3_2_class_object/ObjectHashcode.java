public class ObjectHashcode {

	public static void main(String[] args) {
		int hash = method();
		System.out.println("hashCode = " + hash);
		System.out.println("passed");
	}

	public static int method() {
		return new Object().hashCode();
	}
}
