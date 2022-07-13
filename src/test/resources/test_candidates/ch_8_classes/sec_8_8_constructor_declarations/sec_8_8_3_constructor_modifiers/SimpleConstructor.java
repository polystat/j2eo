public class SimpleConstructor {

	public static void main(String[] args) {
		new Some(5);
		System.out.println("passed");
	}


}

class Some {
	Some(int a) {}
}
