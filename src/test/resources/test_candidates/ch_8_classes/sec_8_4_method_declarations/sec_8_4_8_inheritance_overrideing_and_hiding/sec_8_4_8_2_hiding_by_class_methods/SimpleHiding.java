
class Super {
	static String greeting() { return "Goodnight"; }
	String name() { return "Richard"; }
}

class Sub extends Super {
	static String greeting() { return "Hello"; }
	String name() { return "Dick"; }
}

class SimpleHiding {
	public static void main(String[] args) {
		Super s = new Sub();
		System.out.println(s.greeting() + ", " + s.name());
		System.out.println("passed");
	}
}
