public class CastingForReferenceTypes {

	public static void main(String[] args) {
		Point p = new Point();
		ColoredPoint cp = new ColoredPoint();
		Colorable c;
		//cp = (ColoredPoint)p; // p might not reference an
		//c = (Colorable)p; // p might not be Colorable
		//Long l = (Long)p; // compile-time error #1
		EndPoint e = new EndPoint();
		//c = (Colorable)e; // compile-time error #2
		System.out.println("passed");
	}
}
class Point { int x, y; }
interface Colorable { void setColor(int color); }
class ColoredPoint extends Point implements Colorable {
	int color;
	public void setColor(int color) { this.color = color; }
}
final class EndPoint extends Point {}
