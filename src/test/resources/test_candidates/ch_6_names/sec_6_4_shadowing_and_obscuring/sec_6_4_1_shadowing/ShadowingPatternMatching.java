public class ShadowingPatternMatching {

	static void test(Object a, Object b, Object c) {
		if (a instanceof Point p) {
			System.out.println("a is a point ("+p.x+","+p.y+")");
		}
		if (b instanceof Point p){
			System.out.println("b is a point ("+p.x+","+p.y+")");
		}
		if (c instanceof Point p) {
			System.out.println("c is a point ("+p.x+","+p.y+")");
		}
	}

	public static void main(String[] args) {
		Point p = new Point(2,3);
		Point q = new Point(4,5);
		Point r = new Point(6,7);
		test(p, q, r);
		System.out.println("passed");
	}
}
class Point {
	int x, y;
	Point(int x, int y) { this.x = x; this.y = y; }
}