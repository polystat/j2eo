
public class SwitchWithCharDefaultUsed {
	public static void main(String[] args) {
		char a = '\u0000';
		switch (a) {
			case '\u0001': { System.out.println("fail"); break; }
			case '\u0002': { System.out.println("fail"); break; }
			default: { System.out.println("ok"); break; }
		}
		System.out.println("passed");
	}
}
