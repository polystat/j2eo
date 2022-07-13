
public class ReturnLongStmtBranchedCase {
	public static long max(long a, long b) {
		if (a < b) { return b; }
		return a; 
	}
	public static void main(String[] args) {
		System.out.println(max(0L, 10L));
		System.out.println("passed");
	}
}
