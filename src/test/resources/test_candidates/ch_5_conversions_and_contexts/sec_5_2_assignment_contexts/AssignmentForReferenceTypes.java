public class AssignmentForReferenceTypes {

	public static void main(String[] args) {
		Point p = new Point();
		p = new Point3D();
		//Point3D p3d = p;
		Object o = p;
		int[] a = new int[3];
		Object o2 = a;
		ColoredPoint cp = new ColoredPoint();
		Colorable c = cp;
		byte[] b = new byte[4];
		//a = b;
		Point3D[] p3da = new Point3D[3];
		Point[] pa = p3da;
		//p3da = pa;
		System.out.println("passed");
	}
}
class Point { int x, y; }
class Point3D extends Point { int z; }
interface Colorable { void setColor(int color); }
class ColoredPoint extends Point implements Colorable {
	int color;
	public void setColor(int color) { this.color = color; }
}

