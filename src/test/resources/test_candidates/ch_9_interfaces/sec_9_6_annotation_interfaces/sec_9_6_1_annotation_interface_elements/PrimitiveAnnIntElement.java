public class PrimitiveAnnIntElement {
	public static void main(String[] args) {
		method();
	}
	@interface Some {
		int val();
	}
	@Some(val = 5)
	static void method() {
		System.out.println("passed");
	}
}
