
public class InstanceMethodReference {

	public void eat() {
		System.out.println("yummy!!!");
		System.out.println("passed");
	}
	
	public static void main(String[] args) {
		InstanceMethodReference methRef = new InstanceMethodReference();
		IEdible food = methRef::eat;
		food.consume();
	}
}

interface IEdible {
	void consume();
}
