
public class ReturnDoubleStmtRecursionCase {
	public static void loop(double a) {
		if (a >= 10d) { return; }
		System.out.println(a);
		loop(++a);
	}
	public static void main(String[] args) {
		loop(0d);
		System.out.println("passed");
	}
}
