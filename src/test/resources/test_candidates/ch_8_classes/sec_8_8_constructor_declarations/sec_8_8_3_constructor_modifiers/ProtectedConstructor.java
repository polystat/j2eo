public class ProtectedConstructor {

	public static void main(String[] args) {
		new SubSome();
		System.out.println("passed");
	}

}

class Some {
	protected Some(int a) {}
}

class SubSome extends Some {
	public SubSome() {
		super(5);
	}
}
