
public class SimpleLambdaBody {

	public static void main(String[] args) {
		SomeFunc strFunc = (s) -> {
			int a = 666;
			s = "" + a + s;
			s += a;
			return s;
		};
		System.out.println(strFunc.stringFunc("eo_gang"));
		System.out.println("passed");
	}
}

interface SomeFunc {
	String stringFunc(String input);
}
