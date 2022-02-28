public class NestedIf {
	public static void main(String[] args) {
		boolean truth = true;
		if (truth) {
			if (truth) {
				System.out.println("passed");
			}
		}
	}
}
