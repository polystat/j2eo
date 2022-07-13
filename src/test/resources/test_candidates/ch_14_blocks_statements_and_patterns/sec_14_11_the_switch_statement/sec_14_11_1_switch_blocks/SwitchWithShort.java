
public class SwitchWithShort {
	public static void main(String[] args) {
		short a = (short) 0;
		switch (a) {
			case (short) 0: { System.out.println("ok"); break; }
			case (short) -1: { System.out.println("fail"); break; }
		}
		System.out.println("passed");
	}
}
