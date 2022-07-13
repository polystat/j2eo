
public class SimpleSwitchExpression {
	public static void main(String[] args) {
		int a = 1;
		switch (a) {
			case 1: {
				System.out.println(a);
				break;
			}
			default: {
				System.out.println("Error");
				break;
			}
		}
		System.out.println("passed");
	}
}
