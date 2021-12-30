
public class SimpleInnerClass {

	public static void main(String[] args) {
		Outer o = new Outer();
		//Inner i = new Inner();
		Outer.Inner.hello();
		System.out.println("passed");
	}
}
class HasStatic {
	static int j = 100;
}
class Outer {
	class Inner extends HasStatic {
		static {
			System.out.println("Hello from Outer.Inner");
		}
		static int x = 3;
		static final int y = 4;
		static void hello() {
			System.out.println("Hello from Outer.Inner.hello");
		}
		static class VeryNestedButNotInner extends NestedButNotInner {}
	}
	static class NestedButNotInner {
		int z = Inner.x;
	}
	interface NeverInner {} // Implicitly static, so never inner
}
