public class BooleanToString {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		boolean b = false;
		String s = new Boolean(b).toString();
		System.out.println(s.equals("false"));
		System.out.println("passed");
	}
}
