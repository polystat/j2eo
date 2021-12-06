
public class EvaluatedByFunctionTernaryOperator {
	public static boolean f(int a, int b) {
		return a + 1 == b;
	}
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int res = f(1, 2) ? 1 : 0;
		System.out.println(res);
		System.out.println("passed");
	}
}
