import java.util.Collection;
import java.util.ArrayList;

public class UpperBoundWildcard {

	public static void main(String[] args) {
		Collection<SomeSub1> cs = new ArrayList<SomeSub1>();
		cs.add(new SomeSub1());
		cs.add(new SomeSub1());
		
		Collection<SomeSub2> cs2 = new ArrayList<SomeSub2>();
		cs2.add(new SomeSub2());
		cs2.add(new SomeSub2());

		print(cs);
		print(cs2);
		
		System.out.println("passed");
	}

	static void print(Collection<? extends SomeBase> list) {
		for (SomeBase sb : list) {
			System.out.println(sb.print());
		}
	}
}

interface IPrintable {
	public String print();
}

class SomeBase implements IPrintable {
	@Override
	public String print() {
		return "someBase";
	}
}

class SomeSub1 extends SomeBase {
	@Override
	public String print() {
		return "someSub1";
	}
}

class SomeSub2 extends SomeBase {
	@Override
	public String print() {
		return "someSub2";
	}
}
