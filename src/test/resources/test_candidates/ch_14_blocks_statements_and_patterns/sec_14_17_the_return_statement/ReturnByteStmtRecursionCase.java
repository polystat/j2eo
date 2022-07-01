
public class ReturnByteStmtRecursionCase {
	public static void loop(byte a) {
		if (a >= (byte) 10) { return; }
		System.out.println(a);
		loop(++a);
	}
	public static void main(String[] args) {
		loop((byte) 0);
		System.out.println("passed");
	}
}
