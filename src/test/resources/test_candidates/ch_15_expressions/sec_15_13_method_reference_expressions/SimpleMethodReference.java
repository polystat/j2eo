
public class SimpleMethodReference {

	public static void eat() {
		System.out.println("yummy!!!");
		System.out.println("passed");
	}
	
	public static void main(String[] args) {
		IEdible food = SimpleMethodReference::eat;
		food.consume();
	}
}

interface IEdible {
	void consume();
}
