public class EnumAnnIntElement {
	public static void main(String[] args) {
		method();
	}
	@interface Some {
		SomeEnum val();
	}
	@Some(val = SomeEnum.BRUH)
	static void method() {
		System.out.println("passed");
	}
	enum SomeEnum {
		WOW,
		BRUH
	}
}
