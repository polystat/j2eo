
public class ReturnFloatStmtBranchedCase {
	public static float max(float a, float b) {
		if (a < b) { return b; }
		return a; 
	}
	public static void main(String[] args) {
		System.out.println(max(0f, 10f));
		System.out.println("passed");
	}
}
