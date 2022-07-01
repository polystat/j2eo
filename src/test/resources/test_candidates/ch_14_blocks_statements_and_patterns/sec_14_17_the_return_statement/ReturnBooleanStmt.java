
public class ReturnBooleanStmt {
	public static boolean foo() { return false; }
	public static void main(String[] args) {
		System.out.println(foo());
		System.out.println("passed");
	}
}
