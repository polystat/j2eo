public class ProtectedGenericInterface {

	public static void main(String[] args) {
		System.out.println(new Work().perform());
		System.out.println("passed");
	}

	protected interface IDoable<T> {
		T perform();
	}

	private static class Work implements IDoable<String> {
		@Override
		public String perform() {
			return "working on it...";
		}
	}
}

