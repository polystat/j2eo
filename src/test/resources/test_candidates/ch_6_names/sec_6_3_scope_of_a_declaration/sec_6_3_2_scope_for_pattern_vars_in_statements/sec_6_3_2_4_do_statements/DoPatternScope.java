import java.util.function.Function;

public class DoPatternScope {
	public static void main(String[] args) {
		Function<Object, Boolean> printer = obj -> {
			System.out.println(obj);
			return true;
		};
		Object[] objs = new Object[] { 1, 2, 3, "passed" };
		int index = 0;
		Object obj;
		do {
			index++;
			obj = objs[index];
		}
		while (obj instanceof Integer i && printer.apply(i));
		System.out.println(obj);
	}
}
