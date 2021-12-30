public class SimpleObjectObject {

	public static void main(String[] args) {
		String str = (String)method();
		System.out.println("str = " + str);
		System.out.println("passed");
	}

	public static Object method() {
		return "some";
	}
}
