
public class ReturnCharStmtBranchedCase {
	public static char max(char a, char b) {
		if (a < b) { return b; }
		return a; 
	}
	public static void main(String[] args) {
		System.out.println(max('A', 'B'));
		System.out.println("passed");
	}
}
