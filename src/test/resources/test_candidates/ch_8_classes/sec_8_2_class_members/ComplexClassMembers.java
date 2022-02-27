public class SimpleClassMembers {
	public static void main(String[] args) {
		ColoredPoint c = new ColoredPoint(0, 0);
		c.reset();
		System.out.println("passed");
	}
}

class Point {
	int x, y;
	private Point() { reset(); }
	Point(int x, int y) { this.x = x; this.y = y; }
	void reset() { this.x = 0; this.y = 0; }
}

class ColoredPoint extends Point {
	int color;
	ColoredPoint(int x, int y) { super(x, y); color = 0; }
}

