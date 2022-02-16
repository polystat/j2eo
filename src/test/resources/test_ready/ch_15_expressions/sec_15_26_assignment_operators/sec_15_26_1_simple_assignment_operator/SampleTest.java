
public class ArrayCaseAssigmentOperator {
	public static void main(String[] args) {
		int[] a = {1, 2, 3};
		int[] b = a;
		a[1] = 10;
		System.out.println(b[1]);
		System.out.println("passed");
	}
}
