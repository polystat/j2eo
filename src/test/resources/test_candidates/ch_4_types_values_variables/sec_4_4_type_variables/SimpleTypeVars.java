public class SimpleTypeVars {

	public static void main(String[] args) {
		CT ct = new CT();
		test(ct);
		System.out.println("passed");
	}

	static <T extends C & I> void test(T t) {
		t.mI(); // OK
		t.mCPublic(); // OK
		t.mCProtected(); // OK
		t.mCPackage(); // OK
		//t.mCPrivate(); // Compile-time error
	}
}

class C {
	public void mCPublic() {
		System.out.println("mCPublic()");
	}
	protected void mCProtected() {
		System.out.println("mCProtected()");
	}
	void mCPackage() {
		System.out.println("mCPackage()");
	}
	private void mCPrivate() {
		System.out.println("mCPrivate()");
	}
}
interface I {
	void mI();
}
class CT extends C implements I {
	public void mI() {
		System.out.println("mI()");
	}
}
