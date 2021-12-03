
public class SimpleSwitchDefaultCase {
	public static void main(String[] args) {
		String s = "not string";
		switch (s) {
			case "string": {
				System.out.println(s);
				break;
			}
			default: {
				System.out.println("Default");
				break;
			}
		}
		System.out.println("passed");
	}
}
