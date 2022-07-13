public class DoubleToString {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		double b = 3.0;
		String s = new Double(b).toString();
		System.out.println(s.equals("3.0"));
		System.out.println("passed");
	}
}
