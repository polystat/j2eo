
public class ComplexEvaluationRespectsParenthesesAndPrecedence {
	public static void main(String[] args) {
		double d = 8e+10;
		System.out.println(4.0 / (d * 0.5));
		System.out.println((4.0 / d) * 0.5);
		System.out.println(4.0 / d * 0.5);
		System.out.println("passed");
	}
}
