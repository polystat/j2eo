public class FloatToString {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		float b = 1.0f;
		String s = new Float(b).toString();
		System.out.println(s.equals("1.0"));
		System.out.println("passed");
	}
}
