
public class SwitchWithShortDefaultUsed {
	public static void main(String[] args) {
		short a = (short) 0;
		switch (a) {
			case (short) -1: { System.out.println("fail"); break; }
			case (short) -2: { System.out.println("fail"); break; }
			default: { System.out.println("ok"); break; }
		}
		System.out.println("passed");
	}
}
