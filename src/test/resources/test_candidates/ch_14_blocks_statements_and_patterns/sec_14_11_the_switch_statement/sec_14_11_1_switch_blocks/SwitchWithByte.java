
public class SwitchWithByte {
	public static void main(String[] args) {
		byte a = (byte) 0;
		switch (a) {
			case (byte) 0: { System.out.println("ok"); break; }
			case (byte) -1: { System.out.println("fail"); break; }
		}
		System.out.println("passed");
	}
}
