import java.util.Collection;
import java.util.ArrayList;

public class MultipleTypeArguments {

	public static void main(String[] args) {
		Some<Integer, String, Float, Object> some = 
			new Some<>(20, "wOw", 3.14f, new Object().getClass().getName());
		some.printX();
		some.printY();
		some.printZ();
		some.printW();
		System.out.println("passed");
	}

}

class Some<X,Y,Z,W> {

	X valueX;
	Y valueY;
	Z valueZ;
	W valueW;

	public Some(X x, Y y, Z z, W w) {
		valueX = x;
		valueY = y;
		valueZ = z;
		valueW = w;
	}

	public void printX() {
		System.out.println(valueX.toString());
	}

	public void printY() {
		System.out.println(valueY.toString());
	}

	public void printZ() {
		System.out.println(valueZ.toString());
	}

	public void printW() {
		System.out.println(valueW.toString());
	}
}
