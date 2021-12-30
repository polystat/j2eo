public class ExplicitStaticInstance {

	public static void main(String[] args) {
		Point p = new Point(319, 455);
		System.out.println("p.x = " + p.x);
		System.out.println("p.y = " + p.y);
		Point p1 = new Point();
		System.out.println("Point.origin.x = " + Point.origin.x);
		System.out.println("passed");
	}
}

class Point {
	int x, y;
	Point() { System.out.println("default"); }
	Point(int x, int y) { this.x = x; this.y = y; }
	static Point origin = new Point(0,0);
}