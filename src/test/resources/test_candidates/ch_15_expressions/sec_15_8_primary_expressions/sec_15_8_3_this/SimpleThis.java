
public class SimpleThis {

	public static void main(String[] args) {
		IntVector v1 = new IntVector(5);
		IntVector v2 = new IntVector(6);
		System.out.println(v1.equals(v2));
		System.out.println("passed");
	}
}

class IntVector {
	int[] v;
	IntVector(int size) {
		v = new int[size];
	}
	boolean equals(IntVector other) {
		if (this == other) {
			return true;
		}
		if (v.length != other.v.length) {
			return false;
		}
		for (int i = 0; i < v.length; i++) {
			if (v[i] != other.v[i]) return false;
		}
		return true;
	}
}
