public class SimpleWideningRef {

	public static void main (String[] args) {
		Sub s = new Sub();
		Base b = (Base) s;
		b.print();

		System.out.println("passed");
	}

}

class Base {
	public void print() {
		System.out.println("base");
	}
}
class Sub extends Base {
	@Override
	public void print() {
		System.out.println("sub");
	}
}
