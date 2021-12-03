
public class SimpleStringSwitch {
	public static void main(String[] args) {
		String s = "string";
		switch (s) {
			case "string": {
				System.out.println(s);
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
