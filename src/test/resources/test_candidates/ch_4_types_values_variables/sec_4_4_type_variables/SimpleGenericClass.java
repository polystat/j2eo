public class SimpleGenericClass {

	public static void main(String[] args) {
		Generic<Integer> gen = new Generic<Integer>();
		gen.some = 123;
		System.out.println(gen.getSome());
		System.out.println("passed");
	}

}

class Generic<T> {
	public T some;
	String getSome() {
		return some.toString();
	}
}
