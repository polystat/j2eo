public class ArrayTypeUncheckedConversion {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Some[] raw = new Some[1];
		raw[0] = new Some<String>("wow[]");
		Some<String> s = (Some<String>) raw[0];
		System.out.println("s.value is -> " + s.value);
		System.out.println("passed");
	}
}
class Some<T> {
	public T value;
	public Some(T v) {
		value = v;
	}
}
