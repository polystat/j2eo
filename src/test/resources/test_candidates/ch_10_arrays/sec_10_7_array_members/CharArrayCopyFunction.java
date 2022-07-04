
public class CharArrayCopyFunction {
	public static void main(String[] args) {
		char[] a1 = {'A', 'B', 'C'};
		char[] a2 = a1.clone();
		a1[0] = 'Q';
		for (char item: a1) {
			System.out.println(item);
		}
		for (char item: a2) {
			System.out.println(item);
		}
		System.out.println("passed");
	}
}
