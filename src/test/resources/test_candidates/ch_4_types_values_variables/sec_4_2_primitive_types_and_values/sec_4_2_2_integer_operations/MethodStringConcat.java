public class MethodStringConcat {
    public static void main(String[] args) {
        int a = 5;
        String line = method1() + a + method2();
        System.out.println(line);
        System.out.println("passed");
    }    
	static String method1() {
		return "We had ";
	}
	static String method2() {
		return " cucumbers.";
	}
}
