public class ObjectClone {

	public static void main(String[] args) {
		Some s1 = new Some(5);
		Some s2 = (Some)s1.clone();
		System.out.println("s1 = " + s1.toString());
		System.out.println("s2 = " + s2.toString());
		System.out.println("passed");
	}
}

class Some {
	private int a;
	public Some(int val) {
		a = val;
	}
	@Override
	public String toString() {
		return "some = " + a;
	}
	@Override
	public Object clone() {
		return new Some(a);
	}
}
