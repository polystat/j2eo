public class MultipleVarsSwitch {
	public static void main(String[] args) {
		int a = 5;
		switch (a) {
			case 0:
			case 1:
			case 2:
			case 3:
				System.out.println("not passed");
				break;
			default:
				System.out.println("passed");
				break;
		}
	}
}
