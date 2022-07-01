
public class SwitchWithIntNoBreak {
	public static void main(String[] args) {
		int a = 0;
		switch (a) {
			case 0: { System.out.println("ok"); }
			case -1: { System.out.println("fail"); }
		}
		System.out.println("passed");
	}
}
