public class FloatAdditionNotAssociative {
	public static void main(String[] args) {
		float a = 1f + (2f + 3f);
		float b = (1f + 2f) + 3f;
		System.out.println(a);
		System.out.println(b);
	}
}
