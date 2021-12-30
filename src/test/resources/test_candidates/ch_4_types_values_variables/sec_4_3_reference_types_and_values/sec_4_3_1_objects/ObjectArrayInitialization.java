public class ObjectArrayInitialization {

	public static void main(String[] args) {
		Point a[] = { new Point(0,0), new Point(1,1) };
		System.out.println("a[1].x = " + a[1].x);
		System.out.println("passed");
	}
}

class Point {
	int x, y;
	Point() { System.out.println("default"); }
	Point(int x, int y) { this.x = x; this.y = y; }
	static Point origin = new Point(0,0);
}