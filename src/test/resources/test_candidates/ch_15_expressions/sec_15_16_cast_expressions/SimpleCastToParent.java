
public class SimpleCastToParent {
	public static void main(String[] args) {
		T t = new T();
		System.out.println(((S)t).x);
		System.out.println("passed");
	}
}

class S {
	int x = 0;
}
class T extends S {
	int x = 1;
}
