public class PublicStaticInterface {

	public static void main(String[] args) {
		new Work().doNestedSomething();
		System.out.println("passed");
	}
}

public interface IDoable {
	void doSomething();
	public static interface INestedDoable {
		void doNestedSomething();
	}
}

class Work implements IDoable.INestedDoable {
	@Override
	public void doNestedSomething() {
		System.out.println("doing nested work...");
	}
}
