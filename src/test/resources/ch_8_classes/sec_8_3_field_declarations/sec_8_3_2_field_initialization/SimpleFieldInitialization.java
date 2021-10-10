public class SimpleFieldInitialization {

	public static void main(String[] args) {
		OuterClass obj = new OuterClass();
		obj.var = obj.var2;
		System.out.println(obj.var);
		System.out.println("passed");
	}

}

class OuterClass {
	int var = 2, var2 = 3;
}
