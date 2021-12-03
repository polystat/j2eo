
class S {
	public int id;
	public S(int id) {
		this.id = id;
	}
}

public class AbruptCompletionOfArgumentExpressionWithObjects {
	static S test(S a, S b, S c) {
		return new S(a.id + b.id + c.id);
	}

	static S oops(S s) {
		System.out.println(s.id);
		return new S(0);
	}

	public static void main(String[] args) {
		S s = new S(0);
		test(s = new S(1), oops(s), s = new S(2));
		System.out.println("passed");
	}
}
