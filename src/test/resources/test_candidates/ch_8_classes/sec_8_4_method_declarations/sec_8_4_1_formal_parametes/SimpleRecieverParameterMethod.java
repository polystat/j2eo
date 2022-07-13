public class SimpleRecieverParameterMethod {

	public static void main(String[] args) {
		OuterClass obj = new OuterClass();
		obj.method();
		System.out.println("passed");
	}
}

class OuterClass
{
	void method (OuterClass this) {}
}
