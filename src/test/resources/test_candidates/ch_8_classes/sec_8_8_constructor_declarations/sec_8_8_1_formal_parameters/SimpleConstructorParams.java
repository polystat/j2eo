public class SimpleConstructorParams {

	public static void main(String[] args) {
		new Some(1);
		System.out.println("passed");
	}


}

class Some {
	public Some(int a) {}
}
