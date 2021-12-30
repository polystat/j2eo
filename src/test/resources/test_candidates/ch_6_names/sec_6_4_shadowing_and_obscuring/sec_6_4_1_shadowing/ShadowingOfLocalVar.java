public class ShadowingOfLocalVar {

	public static void main(String[] args) {
		int i;
		class Local {
			{
				for (int i = 0; i < 10; i++)
					System.out.println(i);
			}
		}
		new Local();
		System.out.println("passed");
	}
}
