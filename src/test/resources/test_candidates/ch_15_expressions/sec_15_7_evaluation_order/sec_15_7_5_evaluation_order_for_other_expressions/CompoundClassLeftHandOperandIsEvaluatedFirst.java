
public class CompoundClassLeftHandOperandIsEvaluatedFirst {
	public static void main(String[] args) {
		Test t = new Test(0, null);
		t = (t = (t = new Test(1, t)));
		System.out.println(t.id);
		System.out.println("passed");
	}
}

class Test {
	public int id;
	public Test(int id, Test t) {
		this.id = id;
		if (t != null) {
			System.out.println(t.id);
		}
	}
}