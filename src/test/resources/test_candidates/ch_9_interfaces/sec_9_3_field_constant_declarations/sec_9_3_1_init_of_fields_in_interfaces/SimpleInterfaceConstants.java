public class SimpleInterfaceConstants {

	public static void main(String[] args) {
		System.out.println(ITest.k);
		System.out.println("passed");
	}
}

interface ITest {
	int j = 1;
	float f = j;
	int k = (int)f + 1;
}