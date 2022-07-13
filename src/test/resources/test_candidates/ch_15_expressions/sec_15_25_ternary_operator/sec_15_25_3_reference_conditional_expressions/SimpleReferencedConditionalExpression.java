
public class SimpleReferencedConditionalExpression {
	public static void main(String[] args) {
		S s = new S(0);
		T t = new T(1);
		S res = true ? s : t;
		System.out.println(res.id);
		System.out.println("passed");
	}
}

class S {
	public int id;
	public S(int id) {
		this.id = id;
	}
}
class T extends S {
	public T(int id) {
		super(id);
	}
}