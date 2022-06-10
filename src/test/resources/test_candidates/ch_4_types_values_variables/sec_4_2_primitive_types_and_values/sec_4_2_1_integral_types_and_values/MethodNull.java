public class MethodNull {
	public static void main(String[] args) {
		System.out.println(method());
		System.out.println("passed");
	}
	static Integer method() {
		return null;
	}
}
