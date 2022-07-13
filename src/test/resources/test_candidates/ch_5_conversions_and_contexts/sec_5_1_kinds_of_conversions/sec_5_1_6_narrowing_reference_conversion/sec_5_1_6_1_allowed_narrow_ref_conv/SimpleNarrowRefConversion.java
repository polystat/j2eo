import java.util.*;

public class SimpleNarrowRefConversion {
	public static void main(String[] args) {
		Object lstObj = new ArrayList<Integer>(){{
			add(123);	
			add(456);	
			add(789);	
		}};
		if (lstObj instanceof List) {
			List<?> lst = (List<?>) lstObj;
			System.out.println("does contain 123? -> " + lst.contains(123));
		}
		System.out.println("passed");
	}
}
