
public class AbruptCompletionOfArgumentExpression {
	static int test(int a, int b, int c) {
		return a + b + c;
	}

	static int oops(int id) {
		System.out.println(id);
		return 0;
	}

	public static void main(String[] args) {
		int id = 0;
		test(id = 1, oops(id), id = 2);
		System.out.println("passed");
	}
}
