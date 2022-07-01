
public class SwitchWithCharNoBreak {
	public static void main(String[] args) {
		char a = '\u0000';
		switch (a) {
			case '\u0000': { System.out.println("ok"); }
			case '\u0001': { System.out.println("fail"); }
		}
		System.out.println("passed");
	}
}
