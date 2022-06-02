public class RefIdentityConversion {
	public static void main(String[] args) {
		Integer a = null;
		int b = 10;
		a = (Integer) b;
		System.out.println("a equals to " + a);
		System.out.println("passed");
	}
}
