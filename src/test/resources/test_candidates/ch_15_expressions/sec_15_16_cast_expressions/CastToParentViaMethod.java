
public class CastToParentViaMethod {
	public static T getT() { return new T(); }

	public static void main(String[] args) {
		System.out.println(((S)getT()).x);
		System.out.println("passed");
	}
}

class S {
	int x = 0;
}
class T extends S {
	int x = 1;
}
