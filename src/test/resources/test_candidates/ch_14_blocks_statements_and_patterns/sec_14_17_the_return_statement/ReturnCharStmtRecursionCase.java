
public class ReturnCharStmtRecursionCase {
	public static void loop(char a) {
		if (a >= 'F') { return; }
		System.out.println(a);
		loop(++a);
	}
	public static void main(String[] args) {
		loop('A');
		System.out.println("passed");
	}
}
