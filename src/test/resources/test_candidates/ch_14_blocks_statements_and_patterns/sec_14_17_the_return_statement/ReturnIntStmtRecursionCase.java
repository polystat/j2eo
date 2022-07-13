
public class ReturnIntStmtRecursionCase {
	public static void loop(int a) {
		if (a >= 10) { return; }
		System.out.println(a);
		loop(++a);
	}
	public static void main(String[] args) {
		loop(0);
		System.out.println("passed");
	}
}
