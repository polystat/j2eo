public class ClassAnnIntElement {
	public static void main(String[] args) {
		method();
	}
	@interface Some {
		Class val();
	}
	@Some(val = Object.class)
	static void method() {
		System.out.println("passed");
	}
}
