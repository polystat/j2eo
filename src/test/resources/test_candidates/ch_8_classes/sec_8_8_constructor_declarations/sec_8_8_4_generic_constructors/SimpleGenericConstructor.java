public class SimpleGenericConstructor {

	public static void main(String[] args) {
		new Some<String>("string");
		System.out.println("passed");
	}

}

class Some<T> {
	public Some(T data) {}
}
