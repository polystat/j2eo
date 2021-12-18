public class LongUnboxing {

	public static void main(String[] args) {
		Long a = 100L;
		long b = a.longValue();
		System.out.println("b = " + b);
		System.out.println("passed");
	}
}
