
public class SimpleEvaluationOrderAtMethodInvocationValueCase {
	static void print3(int a, int b, int c) {
		System.out.println(100 * a + 10 * b + c);
	}

	public static void main(String[] args) {
		int s = 1;
		print3(s, s = 2, s);
		System.out.println("passed");
	}
}
