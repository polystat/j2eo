public class ComplexWideningRef {

	public static void main (String[] args) {
		SubSub s = new SubSub();
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
class SubSub extends Sub {
	@Override
	public void print() {
		System.out.println("sub_sub");
	}
}
