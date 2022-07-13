
public class SimpleEvaluationOfOperandsBeforeOperation {
	public static Integer returnInt(Integer integer) {
		System.out.println(integer);
		return integer;
	}

	public static void main(String[] args) {
		Integer integer = 2;
		integer = integer / returnInt(integer);
		System.out.println(integer);
		System.out.println("passed");
	}
}
