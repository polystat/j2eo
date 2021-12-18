public class SimpleObject {

	public static void main(String[] args) {
		Point p = new Point();
		System.out.println("p.x = " + p.x);
		System.out.println("p.y = " + p.y);
		System.out.println("passed");
	}
}

class Point {
	int x = 319;
	int y = 455;
}