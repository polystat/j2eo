
public class SimpleEvaluationOrderAtMethodInvocation {
	static void print3(String a, String b, String c) {
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {
		String s = "A";
		print3(s, s = "B", s);
		System.out.println("passed");
	}
}
