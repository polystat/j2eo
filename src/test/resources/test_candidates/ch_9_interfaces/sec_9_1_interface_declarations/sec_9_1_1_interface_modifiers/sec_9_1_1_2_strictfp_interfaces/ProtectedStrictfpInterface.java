public class ProtectedStrictfpInterface {

	public static void main(String[] args) {
		new Work().doSomething();
		System.out.println("passed");
	}

	protected static strictfp interface IDoable {
		void doSomething();
	}

	private static class Work implements IDoable {
		@Override
		public void doSomething() {
			double some_val = 2.8 * 3.9;
			System.out.println("working... " + some_val);
		}
	}
}

