
public class VoidLambda {

	public static void main(String[] args) {
		SomeFunction f = () -> { System.out.println("passed"); };
		f.process();
	}
}

interface SomeFunction {
	void process();
}
