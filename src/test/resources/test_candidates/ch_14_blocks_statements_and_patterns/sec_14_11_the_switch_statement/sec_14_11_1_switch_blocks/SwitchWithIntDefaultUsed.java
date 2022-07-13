
public class SwitchWithIntDefaultUsed {
	public static void main(String[] args) {
		int a = 0;
		switch (a) {
			case -1: { System.out.println("fail"); break; }
			case -2: { System.out.println("fail"); break; }
			default: { System.out.println("ok"); break; }
		}
		System.out.println("passed");
	}
}
