
public class ReturnDoubleStmtBranchedCase {
	public static double max(double a, double b) {
		if (a < b) { return b; }
		return a; 
	}
	public static void main(String[] args) {
		System.out.println(max(0d, 10d));
		System.out.println("passed");
	}
}
