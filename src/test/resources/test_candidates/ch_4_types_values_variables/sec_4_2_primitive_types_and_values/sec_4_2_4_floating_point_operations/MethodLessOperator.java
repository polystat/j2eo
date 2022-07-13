public class MethodLessOperator {
    public static void main(String[] args) {
        System.out.println(method1() < method2());
        System.out.println("passed");
    }    
	static float method1() {
		return .225f;
	}
	static float method2() {
		return .234f;
	}
}
