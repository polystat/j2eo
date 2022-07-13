public class SimpleRawType<E> {

	E value;
	SimpleRawType(E v) { value = v; }
	E get() { return value; }
	void set(E v) { value = v; }

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		SimpleRawType x = new SimpleRawType<String>("abc");
		System.out.println(x.value); // OK, has type Object
		System.out.println(x.get()); // OK, has type Object
		x.set("def"); // unchecked warning
		System.out.println(x.get());
		System.out.println("passed");
	}
}
