
public class ReturnByteStmt {
	public static byte foo() { return (byte) 0; }
	public static void main(String[] args) {
		System.out.println(foo());
		System.out.println("passed");
	}
}
