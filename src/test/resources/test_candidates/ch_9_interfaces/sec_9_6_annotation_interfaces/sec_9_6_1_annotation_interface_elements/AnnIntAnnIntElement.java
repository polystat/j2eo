public class AnnIntAnnIntElement {
	public static void main(String[] args) {
		method();
	}
	@interface OtherSome {
		int otherVal();
	}
	@interface Some {
		OtherSome val();
	}
	@Some(val = @OtherSome(otherVal = 5))
	static void method() {
		System.out.println("passed");
	}
}
