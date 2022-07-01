
public class ReturnLongStmtRecursionCase {
	public static void loop(long a) {
		if (a >= 10L) { return; }
		System.out.println(a);
		loop(++a);
	}
	public static void main(String[] args) {
		loop(0L);
		System.out.println("passed");
	}
}
