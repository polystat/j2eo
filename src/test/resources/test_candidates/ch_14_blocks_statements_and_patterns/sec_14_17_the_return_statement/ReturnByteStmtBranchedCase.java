
public class ReturnByteStmtBranchedCase {
	public static byte max(byte a, byte b) {
		if (a < b) { return b; }
		return a; 
	}
	public static void main(String[] args) {
		System.out.println(max((byte) 0, (byte) 10));
		System.out.println("passed");
	}
}
