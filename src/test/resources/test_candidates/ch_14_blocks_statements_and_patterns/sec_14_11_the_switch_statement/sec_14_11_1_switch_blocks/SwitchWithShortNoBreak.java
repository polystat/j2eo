
public class SwitchWithShortNoBreak {
	public static void main(String[] args) {
		short a = (short) 0;
		switch (a) {
			case (short) 0: { System.out.println("ok"); }
			case (short) -1: { System.out.println("fail"); }
		}
		System.out.println("passed");
	}
}
