public class MethodAdditive {
    public static void main(String[] args) {
        System.out.println(method1() + method2());        
        System.out.println(method2() - method1());        
        System.out.println("passed");        
    }
	static int method1() {
		return 20;	
	}
	static int method2() {
		return 66;
	}
}
