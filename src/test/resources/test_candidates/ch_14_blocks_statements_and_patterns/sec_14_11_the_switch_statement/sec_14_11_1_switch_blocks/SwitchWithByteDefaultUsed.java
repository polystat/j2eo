
public class SwitchWithByteDefaultUsed {
	public static void main(String[] args) {
		byte a = (byte) 0;
		switch (a) {
			case (byte) -1: { System.out.println("fail"); break; }
			case (byte) -2: { System.out.println("fail"); break; }
			default: { System.out.println("ok"); break; }
		}
		System.out.println("passed");
	}
}
