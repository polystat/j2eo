public class SimpleConstructorOverloading {
	public static void main(String[] args) {
		new Some(1);
		new Some("some");
		System.out.println("passed");
	}
}

class Some {
	public Some(int a) {
		System.out.println("int: " + a);
	}
	public Some(String s) {
		System.out.println("str: " + s);
	}
}
