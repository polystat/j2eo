
public class ArrayLambdaParameter {

	public static void main(String[] args) {
		IntegerFunction f = (arr) -> {
			int sum = 0;
			for (int i : arr) {
				sum += i;
			}
			return sum;
		};

		System.out.println(f.process(new int[] {1, 2, 3, 4, 5}));
		System.out.println("passed");
	}
}

interface IntegerFunction {
	int process(int[] arr);
}
