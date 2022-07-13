
public class SwitchWithChar {
	public static void main(String[] args) {
		char a = '\u0000';
		switch (a) {
			case '\u0000': { System.out.println("ok"); break; }
			case '\u0001': { System.out.println("fail"); break; }
		}
		System.out.println("passed");
	}
}
