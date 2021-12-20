public class ExplicitInstancing {

	public static void main(String[] args) {
		Point p = null;
		try {
			p = (Point)Class.forName("Point").newInstance();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("passed");
	}
}

class Point {
	int x, y;
	Point() { System.out.println("default"); }
	Point(int x, int y) { this.x = x; this.y = y; }
	static Point origin = new Point(0,0);
}