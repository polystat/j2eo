public class CompoundConditionalOperator {
    public static void main(String[] args) {
        int a = 7;
        int b = a > 2 ? 0 : 1;
		int c = 8; 
		int d = a > b ? (b > c ? a : c) : (c < a ? b : c);
        System.out.println(d);
        System.out.println("passed");
    }    
}
