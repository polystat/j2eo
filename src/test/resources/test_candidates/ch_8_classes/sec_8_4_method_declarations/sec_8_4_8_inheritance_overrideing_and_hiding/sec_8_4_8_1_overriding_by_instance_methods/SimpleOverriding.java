
public class SimpleOverriding {

	public static void main(String[] args) {
		SlowPoint p = new SlowPoint();
		p.xLimit = 10;
		p.yLimit = 15;
		p.move(100, -100);

		System.out.println("x: " + p.x + ", y: " + p.y);
		System.out.println("passed");
	}
}
class Point {
	int x = 0, y = 0;
	void move(int dx, int dy) { x += dx; y += dy; }
}
class SlowPoint extends Point {
	int xLimit, yLimit;
	void move(int dx, int dy) {
		super.move(limit(dx, xLimit), limit(dy, yLimit));
	}
	static int limit(int d, int limit) {
		return d > limit ? limit : d < -limit ? -limit : d;
	}
}
