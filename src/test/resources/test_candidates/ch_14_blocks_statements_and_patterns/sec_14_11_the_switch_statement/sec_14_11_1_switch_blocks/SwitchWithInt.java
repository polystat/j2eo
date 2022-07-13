
public class SwitchWithInt {
	public static void main(String[] args) {
		int a = 0;
		switch (a) {
			case 0: { System.out.println("ok"); break; }
			case -1: { System.out.println("fail"); break; }
		}
		System.out.println("passed");
	}
}
