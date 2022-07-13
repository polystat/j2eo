
public class ReturnShortStmt {
	public static short foo() { return (short) 0; }
	public static void main(String[] args) {
		System.out.println(foo());
		System.out.println("passed");
	}
}
