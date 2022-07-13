public class SimpleInterfaceOverloading {

	public static void main(String[] args) {
		new Point().move(5, 6);
		new Point().move(4.0, 4.0);
		new Point().move(4f, 4f);
		System.out.println("passed");
	}
}
interface PointInterface {
	void move(int dx, int dy);
}
interface RealPointInterface extends PointInterface {
	void move(float dx, float dy);
	void move(double dx, double dy);
}
class Point implements RealPointInterface {
	@Override
	public void move(int dx, int dy) {
		System.out.println("int move");
	}

	@Override
	public void move(float dx, float dy) {
		System.out.println("float move");
	}

	@Override
	public void move(double dx, double dy) {
		System.out.println("double move");
	}
}