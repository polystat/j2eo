public class AssignmentContextExample {

	public static void main(String[] args) {
		short s = 12; // narrow 12 to short
		float f = s; // widen short to float
		System.out.println("f=" + f);
		char c = '\u0123';
		long l = c; // widen char to long
		System.out.println("l=0x" + Long.toString(l,16));
		f = 1.23f;
		double d = f; // widen float to double
		System.out.println("d=" + d);
		System.out.println("passed");
	}
}
