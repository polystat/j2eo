public class SimpleSupAndSubInterfaces {

	public static void main(String[] args) {
		new Work().perform();
		System.out.println("passed");
	}
}

interface IExisting {
	void toBe();
}

interface IDoable extends IExisting {
	void perform();
}

class Work implements IDoable {
	@Override
	public void toBe() {
		System.out.println("exising in da world...");
	}

	@Override
	public void perform() {
		toBe();
		System.out.println("performing a job...");
	}
}