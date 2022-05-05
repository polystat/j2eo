public class ReferenceTypeEquals {

	public static void main(String[] args) {
		Some s1 = new Sub();
		Some s2 = new Sub();
		System.out.println("are the same? -> " + s1.getClass().equals(s2.getClass()));
		System.out.println("passed");
	}

}

class Some {}
class Sub extends Some {}
