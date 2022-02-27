public class StaticBindingForMembersAccessPolymorphismCase {
	public static void main(String[] args) {
		T t = new T();
		System.out.println(t.x());
		S s = new S();
		System.out.println(s.x());
		s = t;
		System.out.println(s.x());
		System.out.println("passed");
	}
}

class S {
	int x() { return 0; }
}
class T extends S {
	int x() { return 1; }
}
