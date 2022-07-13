public class SimpleConstructorBody {
	public static void main(String[] args) {
		new Some(2);	
		System.out.println("passed");
	}
}

class Some {
	public Some(int a) {
		System.out.println("version " + a);	
	}
}
