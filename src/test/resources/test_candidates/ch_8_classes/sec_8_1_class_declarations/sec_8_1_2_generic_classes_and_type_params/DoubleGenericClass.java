public class DoubleGenericClass {

	public static void main(String[] args) {
		Generic<String, Integer> g = new Generic<String, Integer>();
		g.method("passed", 123);
	}
}

class Generic<T, K> {
	void method(T arg1, K arg2) {
		System.out.println((Integer)arg2);
		System.out.println((String)arg1);

	}
}
