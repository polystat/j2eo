import java.util.*;

public class ShadowingOfTypeDeclrByAnotherTypeDeclr {

	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println(v.val[0]);
		System.out.println("passed");
	}
}
class Vector {
	int val[] = { 1 , 2 };
}