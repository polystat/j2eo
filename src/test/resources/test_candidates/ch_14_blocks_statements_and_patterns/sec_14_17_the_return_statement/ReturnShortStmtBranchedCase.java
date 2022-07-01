
public class ReturnShortStmtBranchedCase {
	public static short max(short a, short b) {
		if (a < b) { return b; }
		return a; 
	}
	public static void main(String[] args) {
		System.out.println(max((short) 0, (short) 10));
		System.out.println("passed");
	}
}
