public class SimpleSynchronizedBlock {

	public static void main(String[] args) {
		Object obj = new Object();
		synchronized (obj) {
			System.out.println("passed");
		}
	}

}
