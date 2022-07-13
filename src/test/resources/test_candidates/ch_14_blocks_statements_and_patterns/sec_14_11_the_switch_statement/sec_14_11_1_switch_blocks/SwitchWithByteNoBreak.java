
public class SwitchWithByteNoBreak {
	public static void main(String[] args) {
		byte a = (byte) 0;
		switch (a) {
			case (byte) 0: { System.out.println("ok"); }
			case (byte) -1: { System.out.println("fail"); }
		}
		System.out.println("passed");
	}
}
