
public class ReturnShortStmtRecursionCase {
	public static void loop(short a) {
		if (a >= (short) 10) { return; }
		System.out.println(a);
		loop(++a);
	}
	public static void main(String[] args) {
		loop((short) 0);
		System.out.println("passed");
	}
}
