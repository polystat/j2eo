public class MultipleConstructorParams {

	public static void main(String[] args) {
		new Some(1, "some", new float[] { 1f });
		System.out.println("passed");
	}


}

class Some {
	public Some(int a, String s, float[] f) {}
}
