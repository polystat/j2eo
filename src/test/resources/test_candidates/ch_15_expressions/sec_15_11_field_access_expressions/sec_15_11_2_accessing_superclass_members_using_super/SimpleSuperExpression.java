
class T0 { int x = 0; }
class T1 extends T0 { int x = 1; }
class T2 extends T1 { int x = 2; }
class T3 extends T2 {
	int x = 3;
	void test() {
		System.out.println(x);
		System.out.println(super.x);
		System.out.println(((T2)this).x);
		System.out.println(((T1)this).x);
		System.out.println(((T0)this).x);
	}
}

public class SimpleSuperExpression {
	public static void main(String[] args) {
		new T3().test();
		System.out.println("passed");
	}
}
