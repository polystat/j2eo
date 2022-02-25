public class SimpleSwitchBlock {
	public static void main(String[] args) {
		int a = 5;
		switch (a) {
			case 0:
				System.out.println("not passed");
				break;
			default:
				System.out.println("passed");
				break;
		}
	}
}