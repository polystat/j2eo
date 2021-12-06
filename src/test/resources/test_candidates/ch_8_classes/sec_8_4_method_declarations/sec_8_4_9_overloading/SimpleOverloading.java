
public class SimpleOverloading {

	public static void main(String[] args) {
		Point p = new Point();
		p.x = 0;
		p.y = 0;
		p.move(10, -10);
		System.out.println(p);
		System.out.println("passed");
	}
}

class Point {
	float x, y;
	void move(int dx, int dy) { x += dx; y += dy; }
	void move(float dx, float dy) { x += dx; y += dy; }
	public String toString() { return "("+x+","+y+")"; }
}
