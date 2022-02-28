public class PrivateConstructor {

	public static void main(String[] args) {
		new Some();
		System.out.println("passed");
	}


}

class Some {
	private Some(int a) {}
}
