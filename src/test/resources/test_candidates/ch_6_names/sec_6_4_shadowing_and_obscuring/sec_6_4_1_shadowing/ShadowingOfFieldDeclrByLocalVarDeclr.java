public class ShadowingOfFieldDecrlByLocalVarDeclr {

	static int x = 1;
	public static void main(String[] args) {
		int x = 0;
		System.out.print("x=" + x);
		System.out.println(", ShadowingOfFieldDecrlByLocalVarDeclr.x=" + ShadowingOfFieldDecrlByLocalVarDeclr.x);
		System.out.println("passed");
	}
}
