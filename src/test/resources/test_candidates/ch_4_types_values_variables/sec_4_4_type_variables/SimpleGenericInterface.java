public class SimpleGenericInterface {

	public static void main(String[] args) {
		Generic gen = new Generic();
		System.out.println(gen.getSome());
		System.out.println("passed");
	}

}

interface Some<T> {
	public T getSome();
}

class Generic implements Some<Float> {
	@Override
	public Float getSome() {
		return 3.14f;
	}
}
