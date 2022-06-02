public class LongToString {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		long b = 1200L;
		String s = new Long(b).toString();
		System.out.println(s.equals("1200"));
		System.out.println("passed");
	}
}
