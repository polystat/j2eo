
public class SimpleClassExtend {

	public static void main(String[] args) {
		Sub s = new Sub();
		s.method();
	}
}

class Base {
	void method() { System.out.println("passed"); }
}

class Sub extends Base {
	void otherMethod() {}
}
