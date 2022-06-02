import java.util.*;
public class SimpleInvocationContext {
	public static void main(String[] args) {
		getSome('0', 10, "string", new ArrayList<Object>());
	}
	static void getSome(int a, float b, Object c, Collection<?> d) {
		System.out.println("passed");
	}
}
