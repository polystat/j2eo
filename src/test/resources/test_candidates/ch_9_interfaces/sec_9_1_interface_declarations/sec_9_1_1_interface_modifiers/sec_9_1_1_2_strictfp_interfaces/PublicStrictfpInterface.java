public class PublicStrictfpInterface {

	public static void main(String[] args) {
		new Work().doSomething();
		System.out.println("passed");
	}
}

public strictfp interface IDoable {
	void doSomething();
}

class Work implements IDoable {
	@Override
	public void doSomething() {
		double some_val = 2.8 * 3.9;
		System.out.println("working... " + some_val);
	}
}
