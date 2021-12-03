
public class ConstructorReference {
	
	public static void main(String[] args) {
		IEdible apple = Apple::new;
		apple.setYummy(true);
		System.out.println("passed");
	}
}

class Apple {
	Apple(boolean isYummy) {
		System.out.println("An apple " + (isYummy ? "is" : "isn't") + " yummy.");
	}
}

interface IEdible {
	Apple setYummy(boolean isYummy);
}
