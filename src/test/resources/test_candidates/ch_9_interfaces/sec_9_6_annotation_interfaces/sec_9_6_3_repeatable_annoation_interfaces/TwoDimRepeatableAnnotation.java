import java.lang.annotation.Repeatable;
public class TwoDimRepeatableAnnotation {
	public static void main(String[] args) {
		method();
	}
	@Repeatable(SomeContainer.class)
	@interface Some {
		int val();
	}
	@Repeatable(SomeContainerContainer.class)
	@interface SomeContainer {
		Some[] value();
	}
	@interface SomeContainerContainer {
		SomeContainer[] value();
	}
	@SomeContainer({@Some(val = 1)})
	@SomeContainer({@Some(val = 2)})
	static void method() {
		System.out.println("passed");
	}
}
