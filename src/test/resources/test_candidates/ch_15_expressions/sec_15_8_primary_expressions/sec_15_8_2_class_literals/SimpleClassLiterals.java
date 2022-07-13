
public class SimpleClassLiterals {

	public static void main(String[] args) {
		Class<SimpleClassLiterals> c1 = SimpleClassLiterals.class;
		Class<boolean[]> c2 = boolean[].class;
		Class<Void> c3 = void.class;
		System.out.println("passed");
	}
}
