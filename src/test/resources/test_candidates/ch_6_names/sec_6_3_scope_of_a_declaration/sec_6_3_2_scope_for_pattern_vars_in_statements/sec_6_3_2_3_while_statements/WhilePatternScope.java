public class WhilePatternScope {
	public static void main(String[] args) {
		Object[] objs = new Object[] { 1, 2, 3, "passed" };
		int index = 0;
		Object obj = objs[index];
		while (obj instanceof Integer i) {
			index++;
			obj = objs[index];
			System.out.println("int: " + i);
		}
		System.out.println(obj);
	}
}
