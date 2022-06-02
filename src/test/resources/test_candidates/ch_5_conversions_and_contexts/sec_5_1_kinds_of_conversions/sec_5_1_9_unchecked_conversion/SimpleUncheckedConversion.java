public class SimpleUncheckedConversion {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Some raw = new Some<String>("wow");
		Some<String> s = (Some<String>) raw;
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
