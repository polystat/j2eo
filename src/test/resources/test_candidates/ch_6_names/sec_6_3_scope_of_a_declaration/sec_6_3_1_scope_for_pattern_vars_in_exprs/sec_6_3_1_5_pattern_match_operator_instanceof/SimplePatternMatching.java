public class SimplePatternMatching {
	public static void main(String[] args) {
		Some s = new Sub();
		if (s instanceof Sub sub) {
			System.out.println(sub.value);
			return;
		}
		System.out.println("not passed");
	}
}
class Some {}
class Sub extends Some {
	public String value = "passed";
}
