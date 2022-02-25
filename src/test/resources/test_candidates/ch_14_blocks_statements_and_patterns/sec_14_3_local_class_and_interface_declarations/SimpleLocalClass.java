public class SimpleLocalClass {

	static void foo() {
		{
			class Local {}
			{
				// class Local {}
			}
			class AnotherLocal {
				void bar() {
					class Local {}
				}
			}
		}
		class Local {}
	}

	public static void main(String[] args) {
		foo();
		System.out.println("passed");
	}

}
