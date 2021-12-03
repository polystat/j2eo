
public class CompoundEvaluationOfOperandsBeforeOperation {
	public static Integer returnInt2(Integer integer) {
		System.out.println(integer);
		return integer;
	}

	public static Integer returnInt1(Integer integer) {
		System.out.println(integer);
		return integer * returnInt2(integer);
	}

	public static void main(String[] args) {
		Integer integer = 2;
		integer = integer / returnInt1(integer);
		System.out.println(integer);
		System.out.println("passed");
	}
}
