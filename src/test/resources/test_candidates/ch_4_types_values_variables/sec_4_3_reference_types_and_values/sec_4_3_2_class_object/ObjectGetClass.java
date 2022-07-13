public class ObjectGetClass {

	public static void main(String[] args) {
		Some s = new Some();
		System.out.println("class is " + s.getClass().getCanonicalName());
		System.out.println("passed");
	}
}

class Some {}
