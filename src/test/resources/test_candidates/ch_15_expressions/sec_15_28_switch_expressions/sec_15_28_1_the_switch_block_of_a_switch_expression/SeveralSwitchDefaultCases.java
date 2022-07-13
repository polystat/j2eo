
public class SeveralSwitchDefaultCases {
	public static void main(String[] args) {
		String s = "not string";
		switch (s) {
			default: {
				switch (s) {
					default: {
						System.out.println("Default");
						break;
					}
				}
				break;
			}
		}
		System.out.println("passed");
	}
}
