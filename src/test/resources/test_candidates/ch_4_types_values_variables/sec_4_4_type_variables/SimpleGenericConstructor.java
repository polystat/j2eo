public class SimpleGenericConstructor {

	public static void main(String[] args) {
		Generic gen = new Generic(321);
		System.out.println(gen.getSome());
		System.out.println("passed");
	}

}

class Generic {
	private Object some; 
	public <T> Generic(T some) {
		this.some = some;
	}
	String getSome() {
		return some.toString();
	}
}
