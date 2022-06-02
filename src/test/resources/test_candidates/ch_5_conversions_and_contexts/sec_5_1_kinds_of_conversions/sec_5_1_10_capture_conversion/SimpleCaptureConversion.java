public class SimpleCaptureConversion {
	public static void main(String[] args) {
		Some<?> s = generateSome("wow, capture");
		var f = s.getSome();
		System.out.println("what is f.getClass() ? -> " + f.getClass().getSimpleName());
		System.out.println("passed");
	}
	private static <K> Some<?> generateSome(K some) {
		return new Some<K>(some);
	}
}
class Some<T> {
	private T some;
	public Some(T some) {
		this.some = some;
	}
	public T getSome() {
		return some;
	}
}
