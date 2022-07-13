public class CharToString {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		char b = '0';
		String s = new Character(b).toString();
		System.out.println(s.equals("0"));
		System.out.println("passed");
	}
}
