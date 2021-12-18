public class PrimitiveAndReferenceIdentity {

	public static void main(String[] args) {
		int i1 = 3;
		int i2 = i1;
		i2 = 4;
		System.out.print("i1==" + i1);
		System.out.println(" but i2==" + i2);
		Value v1 = new Value();
		v1.val = 5;
		Value v2 = v1;
		v2.val = 6;
		System.out.print("v1.val==" + v1.val);
		System.out.println(" and v2.val==" + v2.val);
		System.out.println("passed");
	}
}

class Value {
	int val;
}