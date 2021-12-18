import java.util.Collection;
import java.util.ArrayList;

public class SimpleTypeArguments {

	public static void main(String[] args) {
		Collection<String> cs = new ArrayList<String>();
		cs.add("hello");
		cs.add("world");
		printCollection(cs);
		System.out.println("passed");
	}

	static void printCollection(Collection<?> c) {
		// a wildcard collection
		for (Object o : c) {
			System.out.println(o);
		}
	}
}
