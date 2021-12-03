
public class SimpleSuperinterface {

	public static void main(String[] args) {
		Lion l = new Lion();
		l.say();
	}
}

interface IAnimal {
	void say();
}

class Lion implements IAnimal {
	public void say() {
		System.out.println("passed");
	}
}
