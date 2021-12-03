
public class SimpleGenericClass {

	public static void main(String[] args) {
		Generic<String> g = new Generic<String>();
		g.method("passed");
	}
}

class Generic<T> {
	void method(T arg) {
		System.out.println((String)arg);
	}
}
