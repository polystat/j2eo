public class ObjectToString {

	public static void main(String[] args) {
		System.out.println(new Some().toString());
		System.out.println("passed");
	}
}

class Some {
	@Override
	public String toString() {
		return "to stringed";
	}
}
