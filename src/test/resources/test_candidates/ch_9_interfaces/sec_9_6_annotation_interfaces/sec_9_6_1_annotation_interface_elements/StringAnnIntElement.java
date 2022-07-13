public class StringAnnIntElement {
	public static void main(String[] args) {
		method();
	}
	@interface Some {
		String val();
	}
	@Some(val = "five")
	static void method() {
		System.out.println("passed");
	}
}
