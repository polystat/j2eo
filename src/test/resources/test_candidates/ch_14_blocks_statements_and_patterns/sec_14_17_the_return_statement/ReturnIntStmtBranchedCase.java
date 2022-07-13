
public class ReturnIntStmtBranchedCase {
	public static int max(int a, int b) {
		if (a < b) { return b; }
		return a; 
	}
	public static void main(String[] args) {
		System.out.println(max(0, 10));
		System.out.println("passed");
	}
}
