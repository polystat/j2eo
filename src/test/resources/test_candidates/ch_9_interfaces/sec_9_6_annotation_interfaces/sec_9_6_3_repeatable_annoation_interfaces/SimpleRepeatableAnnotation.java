import java.lang.annotation.Repeatable;
public class SimpleRepeatableAnnotation {
	public static void main(String[] args) {
		method();
	}
	@Repeatable(SomeContainer.class)
	@interface Some {}
	@interface SomeContainer {
		Some[] value();
	}
	@Some @Some
	static void method() {
		System.out.println("passed");
	}
}
