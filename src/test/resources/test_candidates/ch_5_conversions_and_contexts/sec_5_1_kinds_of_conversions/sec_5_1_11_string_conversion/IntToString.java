public class IntToString {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		int b = 12;
		String s = new Integer(b).toString();
		System.out.println(s.equals("12"));
		System.out.println("passed");
	}
}
