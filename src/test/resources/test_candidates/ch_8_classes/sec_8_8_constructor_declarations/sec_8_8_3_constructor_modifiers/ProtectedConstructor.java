public class ProtectedConstructor {

	public static void main(String[] args) {
		new Some();
		System.out.println("passed");
	}


}

class Some {
	protected Some(int a) {}
}
