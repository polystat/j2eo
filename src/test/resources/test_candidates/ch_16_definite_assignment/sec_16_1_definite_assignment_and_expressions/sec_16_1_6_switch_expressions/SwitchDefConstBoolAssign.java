public class SwitchDefConstBoolAssign {
    public static void main(String[] args) {
        System.out.println(getSwitch(11));
        System.out.println("passed");
    }    
	static int getSwitch(int param) {
		return switch (param) {
			case 1 -> param;
			case 2 -> param * 2;
			case 3 -> param * 3;
			default -> {
				int someVal = param + param / 2;
				yield someVal = someVal * 2;
			}
		};
	}
}
