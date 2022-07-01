
public class ReturnFloatStmtRecursionCase {
	public static void loop(float a) {
		if (a >= 10f) { return; }
		System.out.println(a);
		loop(++a);
	}
	public static void main(String[] args) {
		loop(0f);
		System.out.println("passed");
	}
}
