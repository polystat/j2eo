public class SimpleLabeledStatements {
	public static void main(String[] args) {
		TestString s = new TestString(new char[] { 'b' });
		System.out.println(new TestString(new char[] { 'c', 'b'}).indexOf(s, 0));
		System.out.println("passed");
	}
}

class TestString {
	char[] value;
	int offset, count;

	TestString(char[] value) {
		this.value = value;
	}

	int indexOf(TestString str, int fromIndex) {
		char[] v1 = value, v2 = str.value;
		int max = offset + (count - str.count);
		int start = offset + ((fromIndex < 0) ? 0 : fromIndex);
	i:
		for (int i = start; i <= max; i++) {
			int n = str.count, j = i, k = str.offset;
			while (n-- != 0) {
				if (v1[j++] != v2[k++])
					continue i;
			}
			return i - offset;
		}
		return -1;
	}
}